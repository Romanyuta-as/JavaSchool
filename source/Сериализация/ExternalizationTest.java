package Сериализация;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */
class DateAndTime implements Externalizable{
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int seconds;

    public DateAndTime() {
        this.year = 2016;
        this.month = 8;
        this.day = 8;
        this.hour = 19;
        this.minute = 36;
        this.seconds = 45;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    @Override
    public String toString() {
        return "DateAndTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                ", minute=" + minute +
                ", seconds=" + seconds +
                '}';
    }

    public static void Input (String fileName ){
        try {

            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            DateAndTime dat = (DateAndTime) ois.readObject();
            System.out.println(dat.toString());
        }catch (Exception e)
        {
            e.getMessage();
        }
    }
    public static void Output_one (String fileName ){
        DateAndTime dat = new DateAndTime();
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
public class ExternalizationTest extends DateAndTime {
    public static void main(String[] args) {
        //DateAndTime dat = new DateAndTime();
        String fileName = "C:\\Work\\date.bin";
        Output_one(fileName);
        Input(fileName);
    }

}
