package HomeWork.HomeWork8.test;
import pr.MyIterator;

import java.util.Iterator;

/**
 * Created by 1 on 08.08.2016.
 */
public class MyIteratorTest {

    public static void main(String[] args) {

    MyIterator<String> test = new MyIterator<>(new String[2],2);
        test.add("Hi");
        test.add("Hi");
        Iterator<String> it = test.iterator();
        while (it.hasNext())
        {
            System.out.println(test.iterator().next());
        }
    }

}
