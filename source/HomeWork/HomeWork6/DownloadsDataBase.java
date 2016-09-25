package HomeWork.HomeWork6;

import HomeWork.HomeWork6.MyInvocationHandler.Structure;

import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by 1 on 25.09.2016.
 */
public class DownloadsDataBase {
    private  Connection connection;
    private Statement statement;
    public DownloadsDataBase() {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","")) {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Map<Structure,Object> downloadDBToStructure(){
        try(Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","")) {
            statement = connection.createStatement();
            Map<Structure,Object> cache = new HashMap<>();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CALC");
            Object[] args = new Object[2];
            while (resultSet.next()){
            //    System.out.println("Операция: "+resultSet.getString("OPERATION")+" arg1: "+resultSet.getDouble("arg1")+" arg2: "+resultSet.getDouble("arg2"));

                args[0] = resultSet.getDouble("arg1");
                args[1] = resultSet.getDouble("arg2");
                Structure structure = new Structure(resultSet.getString("OPERATION"),args);
                cache.put(structure,resultSet.getDouble("Result"));

            }
            return cache;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void downloadStructureToDB(Map<Structure,Object> cache){
        String command = "";
        try(Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","")) {
            statement = connection.createStatement();
            statement.addBatch("drop table CALC;");
            command = command+"create table CALC(ID NUMBER, OPERATION VARCHAR2(1000), ARG1 NUMBER, ARG2 NUMBER, RESULT NUMBER) AS"+" SELECT ROWNUM, TAB.* FROM( ";
            int chet = 1;
            for (Map.Entry<Structure, Object> entry : cache.entrySet()) {
                String name =  entry.getKey().getMethodName();
                Object[] args = entry.getKey().getArgs();
                if(cache.size() == chet){
                    command = command+" "+"SELECT "+" '"+name+"',"+args[0].toString()+","+args[1].toString()+","+entry.getValue().toString()+ " from dual";
                 }
                 else
                 {
                     command = command+" "+"SELECT "+" '"+name+"',"+args[0].toString()+","+args[1].toString()+","+entry.getValue().toString()+ " from dual union";
                 }
                chet++;
            }
            command = command+")tab";
            statement.addBatch(command);
            int[] executeBatxh = statement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
