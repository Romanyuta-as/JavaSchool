package lesson10;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Student on 11.08.2016.
 */
public class test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,1,3,3,2,4);
        int sum = numbers.stream().reduce(1,(a,b)->a+b);
        System.out.println(sum);
    }
}
