package lesson11;

/**
 * Created by Student on 15.08.2016.
 */
public class SomeTusk implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i<3; i++) {
            System.out.println(Thread.currentThread().getName()+"("+ i+")");
        }

    }

    public static void main(String[] args) {

       SomeTusk st = new SomeTusk();
        Thread th = new Thread(st);

        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("a");
       // for (int i=0;i<5;i++) {
         //   new Thread(st).start();


       // }
        ///SomeThread st = new SomeThread();
       //// st.start();

        //st.run();
    }
}
