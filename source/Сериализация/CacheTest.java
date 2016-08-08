package Сериализация;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */
class Data implements Serializable{
    String value;

    public Data(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value='" + value + '\'' +
                '}';
    }
    public static void Input (String fileName ){
        try {

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Data dat = (Data) ois.readObject();
            System.out.println(dat.toString());
        }catch (Exception e)
        {
            e.getMessage();
        }
    }
    public static void Output_one (String fileName, String value ){
        Data dat = new Data(value);
        try {

            FileOutputStream fis = new FileOutputStream(fileName);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(dat);
        }catch (Exception e)
        {
            e.getMessage();
        }
    }
}
public class CacheTest {
    public static void main(String[] args) {

    }
}
