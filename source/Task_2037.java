/**
 * Created by Student on 15.07.2016.
 */
public class Task_2037 {
    public static void main(String[] args)
    {
        int k = 3;
        String enline = " ,as,qwerty,zxc,asdf";
        String[] mas = enline.split(",");
        String rez = "";
        for(int i=0;i<mas.length;i++)
            if(mas[i].length()>=k)
                rez = rez+mas[i]+",";

        System.out.println(rez.substring(0,rez.length() -1));


    }
}
