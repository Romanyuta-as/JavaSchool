package HomeWork.HomeWork11_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 1 on 21.08.2016.
 */
public class Test {
    public static void main(String[] args) {
        Task task = new Task(1000, 100);
        ExecutorService es = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 11; i++) {

                es.submit(() -> task.addBalance(100));

        }
        es.shutdown();
    }
}
