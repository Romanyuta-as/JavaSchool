package HomeWork.HomeWork10;

/**
 * Created by 1 on 14.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Conventer<String,Integer> conventer = (from) ->Integer.valueOf(from);
        Integer convt = conventer.convert("123");
        System.out.println(convt);
    }
}
