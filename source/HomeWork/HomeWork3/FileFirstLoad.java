package HomeWork.HomeWork3;

import ru.sbertech.lesson3.BeforeGenerics.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by AlexRS on 20.07.2016.
 */
public class FileFirstLoad {
    public static Collection<File>init(Collection<File> files) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AlexRS\\Desktop\\text.txt"));
        String str = "";

        while ((str = br.readLine()) != null) {
            sb.append(str);
            sb.append(" ");

        }
        String[] mas = sb.toString().split(" ");
        for(int i=0;i<mas.length;i++)
        {
            //files(new File(mas[i],mas[i].length()));
        }

        return files;
    }

    public static void  print(Collection<File> persons)
    {
        Iterator<File> it = persons.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next().toString());
        }
    }

    public static ArrayList<File> Sort(ArrayList<File> mas){
        int max = 0;
        ArrayList<File> sortMas = new ArrayList<>();
        for(int i=0;i<mas.size();i++){
            if(mas.get(i).dlina>max)
                max = mas.get(i).dlina;
        }
        int chet=1;
        while (chet!=max)
        {

            for(int i=0;i<mas.size();i++){
                if(mas.get(i).getDlina()==chet)
                    sortMas.add(mas.get(i));
            }
            chet++;
        }

        return sortMas;

    }
}
