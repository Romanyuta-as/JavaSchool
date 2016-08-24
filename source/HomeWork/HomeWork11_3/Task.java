package HomeWork.HomeWork11_3;

import java.util.concurrent.Callable;

/**
 * Created by 1 on 23.08.2016.
 */
public class Task <T>{
    private T result;
    private RuntimeException runtimeException;
    private Callable<? extends T> callable;
    private final Object myObj = new Object();

    public Task(Callable<? extends T> callable) {
        if (callable == null)
            throw new IllegalArgumentException();
        this.callable = callable;
    }

    public T get() {
        if (result == null && runtimeException == null){
            synchronized (myObj){
                if (result == null && runtimeException == null){
                    try {
                        result = callable.call();
                    }
                    catch (RuntimeException re){
                        runtimeException = re;
                    }
                    catch (Exception e){
                        runtimeException = new RuntimeException(e);
                    }
                }
            }
        }
        if (runtimeException != null)
            throw runtimeException;
        return result;
    }

}
