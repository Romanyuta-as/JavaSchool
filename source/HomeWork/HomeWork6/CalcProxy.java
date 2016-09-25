package HomeWork.HomeWork6;

import java.lang.reflect.Proxy;

/**
 * Created by 1 on 14.09.2016.
 */
public class CalcProxy {
    public static void main(String[] args) {
        MyCalc myCalc = new MyCalc();
        MyInvocationHandler cache = new MyInvocationHandler<>(myCalc);
        ICalc iCalc =  (ICalc)Proxy.newProxyInstance(MyCalc.class.getClassLoader(),MyCalc.class.getInterfaces(),cache);
        double result = iCalc.sum(1,2);
        System.out.println(result);
        result = iCalc.div(1,2);
        System.out.println(result);
        result = iCalc.sum(1,2);

        System.out.println(result);

//        DownloadsDataBase dataBase = new DownloadsDataBase();
//        dataBase.downloadDBToStructure();
        cache.unloading();

    }

}
