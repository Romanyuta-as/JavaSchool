/**
 * Created by Student on 15.07.2016.
 */
public class Tusk_2053{
        public static int maxx(int[] mas)
        {
            int max=mas[0];
            for(int i=0;i<mas.length;i++)
                if(mas[i]>max)
                    max = mas[i];

            return max;
        }
        public static int[] code(String Words)
        {
            String[] mas  = Words.split(" ");
            int[] rezMas = new  int[mas.length];
            int flag=0;
            for(int i=0;i<mas.length;i++)
            {
                if(i==0)
                    rezMas[i] = 1;
                else
                    for(int j=i-1;j>=0;j--)
                    {
                        if(mas[i].equals(mas[j]))
                        {
                            flag=j;
                            break;
                        }
                        else
                        {
                            flag = -1;
                        }
                    }
                if(flag!= - 1)
                    rezMas[i] = rezMas[flag];
                else
                    rezMas[i] = maxx(rezMas)+1;
            }
            return rezMas;
        }
        public static void main(String[] args)
        {
            String Words = "a aa aaa aaaa a aa aaa bbbb";
            int[] rez = code(Words);
            for(int i=0;i<rez.length;i++)
                System.out.print(rez[i]+" ");


        }
}
