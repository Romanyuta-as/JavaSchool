package HomeWork.HomeWork11_3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by 1 on 24.08.2016.
 */
public class MyContext implements Context{
    public Future[] futures;
    public RunnableImpl[] runnable;

    public MyContext(Future[] futures, RunnableImpl[] runnable) {
        this.futures = futures;
        this.runnable = runnable;
    }

    @Override
    public int getCompletedTaskCount() {
        int rez = 0;
        for(int i=0;i<futures.length;i++) {
            if (!futures[i].isDone()) {
                continue;
            }
                try {
                    futures[i].get();
                    rez++;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        return rez;
    }


    @Override
    public int getFailedTaskCount() {
        int rez = 0;
        for(int i=0;i<futures.length;i++) {
            if (!futures[i].isDone()) {
                continue;
            }
            try {
                futures[i].get();

            } catch (Exception e) {
                rez++;
            }

        }
        return rez;
    }

    @Override
    public int getInterruptedTaskCount() {
        int rez=0;
        for(RunnableImpl ri: runnable){
            if(ri.isFlag())
                rez++;
        }
        return rez;
    }

    @Override
    public void interrupt() {
        for(int i=0;i<runnable.length;i++){
            runnable[i].stop();
        }
    }

    @Override
    public boolean isFinished() {
        for(Future fu: futures) {
        if(!fu.isDone())
            return false;
        }

        return true;
    }
}
