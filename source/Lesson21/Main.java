package Lesson21;

import java.sql.*;

/**
 * Created by Student on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","")){
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from songs");
//            while (resultSet.next()){
//                System.out.println("Song name: "+ resultSet.getString("NAME") + " Time: "+ resultSet.getBigDecimal(4));
//            }
            PreparedStatement preparedStatement = connection.prepareStatement("select* from songs where id =?");
            preparedStatement.setString(1,"25");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                System.out.println("Song name: "+ resultSet.getString("NAME") + " Time: "+ resultSet.getBigDecimal(4));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
