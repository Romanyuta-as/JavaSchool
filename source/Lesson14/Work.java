package Lesson14;

import java.util.concurrent.*;

/**
 * Created by Student on 25.08.2016.
 */
public class Work {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.scheduleAtFixedRate(new Reminder(),0,5, TimeUnit.SECONDS);// каждые 5 сек запускает поток
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        scheduledExecutorService.shutdown();

        MyFutureRunnable myFutureRunnable = new MyFutureRunnable(new MyCallable());
        ExecutorService  executorService = Executors.newSingleThreadExecutor();

        executorService.execute(myFutureRunnable);
        if(!myFutureRunnable.isDone()){
            System.out.println(myFutureRunnable.get());
        }
        executorService.shutdown();
    }
}
