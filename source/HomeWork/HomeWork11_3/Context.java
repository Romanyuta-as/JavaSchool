package HomeWork.HomeWork11_3;

/**
 * Created by 1 on 24.08.2016.
 */
public interface Context {
    int getCompletedTaskCount();

    int getFailedTaskCount();

    int getInterruptedTaskCount();

    void interrupt();

    boolean isFinished();

}
