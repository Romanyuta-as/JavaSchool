package Исключения;

/**
 * Created by Student on 26.07.2016.
 */
public class StackOverFlowTest {
    static int count = 0;
    public static void main(String[] args){
        System.out.println(count++);
        main(args);
    }
}
