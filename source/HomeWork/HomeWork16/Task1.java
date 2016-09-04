package HomeWork.HomeWork16;

import java.util.HashMap;

/**
 * Created by 1 on 04.09.2016.
 */
public class Task1 {
    public static void main(String[] args) {
        int SIZE = 100000;
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < SIZE; i++) {
            map.put(i, inl(i));
        }
    }
    private static String inl(int i){
        return "Value" + i;
    }
}
