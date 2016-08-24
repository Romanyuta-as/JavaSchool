package HomeWork.HomeWork11_3;

/**
 * Created by 1 on 24.08.2016.
 */
public class RunnableImpl implements Runnable {
    private boolean flag = false;
    private Runnable runnable;

    public RunnableImpl(Runnable runnable) {
        this.runnable = runnable;
    }

    public boolean isFlag() {
        return flag;
    }

    public void stop(){
        flag = true;
    }
    @Override
    public void run() {
        if(!flag){
            runnable.run();
        }
    }
}
