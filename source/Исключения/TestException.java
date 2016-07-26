package Исключения;

/**
 * Created by Student on 26.07.2016.
 */
public class TestException {
    public static  void main(String[] args){
        a();
    }

    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        int x = 1;
        int y =0;
        System.out.print(x/y);
    }
}
