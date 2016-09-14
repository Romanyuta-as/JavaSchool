package HomeWork.HomeWork6;

import java.lang.reflect.Proxy;

/**
 * Created by 1 on 14.09.2016.
 */
public class CalcProxy {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        ICalc iCalc = (ICalc) Proxy.newProxyInstance(MyCalc.class.getClassLoader(),MyCalc.class.getInterfaces(),new MyInvocationHandler(myCalc));
        double result = iCalc.sum(1,2);
        System.out.println(result);
        result = iCalc.sum(1,2);
        System.out.println(result);

    }

}
