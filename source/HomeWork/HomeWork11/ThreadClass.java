package HomeWork.HomeWork11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by 1 on 17.08.2016.
 */
public class ThreadClass {

    public static Integer readFileSettings(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = "";

        while ((str = br.readLine()) != null) {
            sb.append(str);

        }
        //String[] mas = sb.toString().split(" ");

        return  Integer.valueOf(sb.toString());
    }
    public  static ArrayList<String> readBook(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String str = "";

        while ((str = br.readLine()) != null) {
            sb.append(str);
            sb.append(" ");

        }
        ArrayList<String> book = new ArrayList<>(Arrays.asList(sb.toString().split(" ")));
       return book;
    }
    public static void main(String[] args) throws IOException {
        Integer pool = readFileSettings("C:\\Users\\1\\Documents\\1.txt");
        ArrayList<String> words = readBook("C:\\Users\\1\\Documents\\2.txt");
        ExecutorService es = Executors.newFixedThreadPool(20);
        List<Future<String>> list = new ArrayList<>();
        ArrayList<String> test = new ArrayList<>();
        for (int i=0;i<words.size();i++) {
            final  String slovo = words.get(i);
               Future<String> future =
                       es.submit(() -> "Слово: "+slovo+ "  -----  "+ "Длина: "+slovo.length()+"----------"+"Номер потока: "+Thread.currentThread().getName());
            list.add(future);


        }
        for(Future<String> fut : list){
            try {

                System.out.println(fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Общая длина исходного массива: "+words.size()+"----------"+"Длина массива после обработки: "+list.size());
        es.shutdown();
       // System.out.println(words.size()+"------"+test.size());
        //System.out.println(pool+"   "+pool.getClass().getTypeName().toString());


    }
}
