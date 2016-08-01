package ClassLoaders;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by Student on 01.08.2016.
 */
public class Main {
    public static void main(String[] args)  {
        //System.out.println("1");
        //try {
        //    Person person  = (Person) Main.class.getClassLoader().loadClass("ClassLoaders.Person").newInstance();
       // }catch (Exception e ){
          //  System.out.println(e.toString());
       // }

      //  System.out.println("2");
        try {
        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file:/J:/lecture7/person.jar")});
            Class<?> persClass = urlClassLoader.loadClass("ru.sbt.bvv.lecture7.CalculatorImpl");
            ((Calculator) persClass.newInstance()).calc();
            Calculator calculator = new CalculatorImpl();
            calculator.calc();


           /// Method method = persClass.getDeclaredMethod("info");
           /// method.invoke(persClass.newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
