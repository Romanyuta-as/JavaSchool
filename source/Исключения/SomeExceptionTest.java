package Исключения;

import javax.imageio.IIOException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Student on 26.07.2016.
 */
public class SomeExceptionTest {
    public static void main(String[] args) {
        try{
            Integer.parseInt("Im not number");
            new URL("ThisNotURL");
            new URL("www.yandex.ru").getContent();
            int a = 1/0;
        }catch (NumberFormatException e){
            System.out.println(e.toString());
        }catch (MalformedURLException e){
            System.out.println(e.toString());
        }catch (IOException | ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
