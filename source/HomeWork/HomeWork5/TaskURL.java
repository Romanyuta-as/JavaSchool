package HomeWork.HomeWork5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by AlexRS on 27.07.2016.
 */
public class TaskURL {
    public static void main(String[] args) {
        String adress;
        System.out.println("Введите адрес: ");
        Scanner in = new Scanner(System.in);
        adress = in.nextLine();

        try {
            URL ya = new URL(adress);
            BufferedReader br = new BufferedReader(new InputStreamReader(ya.openStream()));
            String vuvod;
            while ((vuvod = br.readLine())!= null){
                System.out.println(vuvod);
            }

        }catch (Exception e){
            System.out.println("Вы ввели неверный адрес сайта введите снова");
            main(null);
        }

    }
}
