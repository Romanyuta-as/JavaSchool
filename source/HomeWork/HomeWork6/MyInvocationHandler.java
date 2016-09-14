package HomeWork.HomeWork6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 1 on 14.09.2016.
 */
public class MyInvocationHandler implements InvocationHandler {
    private  Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("NeverSleepingEye invoke : " + method.getName());
        return method.invoke(object,args);
    }
}
