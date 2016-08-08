package Сериализация;

import java.io.*;

/**
 * Created by Student on 08.08.2016.
 */

//class Person{
//    private String firstName;
//    private int age;
//
//    public Person() {
//        this.firstName = "Alex";
//        this.age = 22;
//
//    }
//}
public class Student implements Serializable {
    private String group;
    private int avgMark;
    private String password;

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                ", avgMark=" + avgMark +
                ", password='" + password + '\'' +
                '}';
    }

    public Student() {
        this.group = "default";
        this.avgMark = 3;
        this.password = "12345";
        System.out.println("Im constructor");
    }
    private void writeObject(ObjectOutputStream out) throws IOException {
        avgMark = avgMark^0xFFFFFF;
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        avgMark = avgMark^0xFFFFFF;
    }
    public static void Input (String fileName ){
    try {

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student student = (Student) ois.readObject();
        System.out.println(student.toString());
    }catch (Exception e)
    {
        e.getMessage();
    }
    }
    public static void Output_one (String fileName ){
        Student student = new Student();
        try {

            FileOutputStream fis = new FileOutputStream(fileName);
            ObjectOutputStream ois = new ObjectOutputStream(fis);
            ois.writeObject(student);
        }catch (Exception e)
        {
            e.getMessage();
        }
    }



    public static void main(String[] args) {
        //Student student = new Student();
        String fileName = "C:\\Work\\student.bin";
        Output_one(fileName);
        Input(fileName);
    }
}
