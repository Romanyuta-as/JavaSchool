/**
 * Created by Student on 15.07.2016.
 */
public class Task_2021 {
    public static int[] maxx (int[] mas)
    {
        int max = 0;
        for(int i=0;i<mas.length;i++)
            if(mas[i]>max)
                max = mas[i];
        for(int j=0;j<mas.length;j++)
            if(mas[j] == max )
                for(int k=0;k<2;k++)
                    mas[j] = mas[j]/2;

        return mas;
    }
    public static void main(String[] args)
    {
        int[] mas = {1,2,2,3,5};
        mas = maxx(mas);
        for(int i=0;i<mas.length;i++)
            System.out.print(mas[i]);
        System.out.print(" ");
    }
}
