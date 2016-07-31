package HomeWork.HomeWork6;
import java.lang.reflect.Method;
import java.util.Arrays;
/**
 * Created by 1 on 31.07.2016.
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println("------------Все геттеры класса-----------------");
        Method [] methods = Task_1.class.getDeclaredMethods();
        for(Method method: methods){
            if(method.getName().contains("get")){
                System.out.println(method.getName());
            }
        }
        System.out.println("-----------------------------------------------");
    }

}
