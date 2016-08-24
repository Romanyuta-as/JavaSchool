package HomeWork.HomeWork11_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by 1 on 24.08.2016.
 */
public abstract class MyExecutionManager implements ExecutionManager {
    private ExecutorService es;

    public MyExecutionManager(int kolvo) {
        es = Executors.newFixedThreadPool(kolvo);
    }

    public void shutdown(){
        es.shutdown();
    }

    @Override
    public Context execute(Runnable call, Runnable[] tasks) {
        RunnableImpl[] futures = new RunnableImpl[tasks.length];
        RunnableImpl[] runnables = new RunnableImpl[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            runnables[i] = new RunnableImpl(tasks[i]);
            futures[i] = (RunnableImpl) es.submit(runnables[i]);
        }
        Context rez = new MyContext((Future[]) futures, runnables);
        return rez;
    }
}
