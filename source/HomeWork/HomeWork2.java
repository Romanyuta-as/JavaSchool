package HomeWork;

/**
 * Created by AlexRS on 17.07.2016.
 */
import java.util.*;
import java.io.*;
public class HomeWork2 {
    public static void Read(String fileName) throws IOException {
        if(!Exitsts(fileName))
            System.out.println("Такого файла не существует");
        else
        {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str = "";

            while ((str = br.readLine()) != null) {
                sb.append(str);
                sb.append(" ");

            }


            String[] mas;
            String rez = sb.toString().replace("."," ");
            rez = rez.replace(","," ");
            mas = rez.split(" ");
            Sort(mas);




        }

    }

    public static void Sort (String [] mas)
    {
        int chet = 1;
        ArrayList<String> al = new ArrayList<String>();
        while(chet!=100)
        {
            for(int i=0;i<mas.length;i++)
            {
                if(mas[i].length()==chet)
                    al.add(mas[i]);
            }
            chet++;
        }
        for(int i= 0; i<al.size();i++)
            System.out.println(al.get(i));
    }

    public static boolean Exitsts(String fileName)
    {
        File file  = new File(fileName);
        if(!file.exists())
            return false;
        else
            return true;
    }

    public static void main(String[] args) throws IOException
    {
        Read("C:\\Users\\Student\\Desktop\\text.txt");
    }
}
