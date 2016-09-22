package HomeWork.HomeWork6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Created by 1 on 14.09.2016.
 */
public class MyInvocationHandler<T> implements InvocationHandler {
    private  T t;
    //private List<Structure> cache = new LinkedList<>();
    private Map<Structure,Object> cache = new HashMap<>();
    private Structure structure;
    public MyInvocationHandler(T t) {
        this.t = t;
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

         structure = new Structure(method,args);
        if(cache.containsKey(structure)){
            System.out.println("Взято из кэша");
            return cache.get(structure);

        }
        else
        {
           Object result = method.invoke(t, args[0], args[1]);
            cache.put(structure,result);
            return result;
        }

        //System.out.println("NeverSleepingEye invoke : " + method.getName());
        //return method.invoke(object,args);
    }
    class Structure {
        private Method method;
        private Object[] args;



        public Structure(Method method, Object[] args) {
            this.method = method;
            this.args = args;

        }



        public String getMethodName() {
            return method.getName();
        }
        @Override
       public int hashCode() {
           int result =0;// method.hashCode();
           result = 31  + Arrays.hashCode(args);
          return result;
        }
    }

}
