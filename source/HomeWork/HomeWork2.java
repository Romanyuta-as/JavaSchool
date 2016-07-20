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
            ArrayList<String> al = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String str = "";

            while ((str = br.readLine()) != null) {
                sb.append(str);
                sb.append(" ");

            }

            Collections.addAll(al,sb.toString().split(" "));
            Sort(al);
            print(al);




        }

    }

    public static void Sort (ArrayList<String> al)
    {
        Collections.sort(al, (o1, o2) -> o1.toString().compareTo(o2.toString()));
    }

    public static void print(ArrayList<String> mas)
    {
        Iterator<String> it = mas.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next().toString());
        }
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
        Read("C:\\Users\\AlexRS\\Desktop\\text.txt");
    }
}
