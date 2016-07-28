package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Student on 29.07.2016.
 */
public class Test {
    public static void main(String[] args) {

        // Arrays.asList(C.class.getDeclaredMethods()).forEach(System.out::println);
        //try {
        //    A.class.getDeclaredMethod("pA", String.class);
        // }catch (NoSuchMethodException name){
        //    System.out.println("Нет такого метода");
        //}
        try {
           // Method m = A.class.getMethod("pA", String.class);
//            m.invoke(A.class.newInstance(),"1223");
           // Field f = C.class.getDeclaredField("aC");
            //f.setAccessible(true);
            //C c = new C();
            //System.out.println(f.get(c));
            //f.set(c,"second");
            //System.out.println(f.get(c));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
