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
    private DownloadsDataBase dataBase = new DownloadsDataBase();
    public MyInvocationHandler(T t) {
        this.t = t;
      cache =  dataBase.downloadDBToStructure();
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

         structure = new Structure(method.getName(),args);
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
    public void unloading(){
        dataBase.downloadStructureToDB(cache);
    }
    static class Structure {
        private String methodName;
        private Object[] args;



        public Structure(String methodName, Object[] args) {
            this.methodName = methodName;
            this.args = args;

        }

        public Object[] getArgs() {
            return args;
        }

        @Override
        public boolean equals(Object obj) {
            if(this == obj) return false;
            if(obj == null) return false;
            Structure str = (Structure) obj;
            if(!methodName.equals(str.getMethodName())) return false;
            return Arrays.equals(args,str.getArgs());

        }

        public String getMethodName() {
            return methodName;
        }
        @Override
       public int hashCode() {
           int result =0;// method.hashCode();
           result = 31  + Arrays.hashCode(args);
          return result;
        }
    }

}
