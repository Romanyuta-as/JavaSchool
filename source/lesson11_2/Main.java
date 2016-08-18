package lesson11_2;

import java.util.Date;

/**
 * Created by Student on 18.08.2016.
 */
public class Main {

    public static void main(String[] args) {
//        final Account account = new Account(100);
//
//      int x=3;
//        for(int i=0;i<x;i++){
//           new Thread(account).start();
//        }
//        Sqare sqare = new Sqare(1,2,3);
//        Test test = new Test();
//        Thread t1 = new Thread(test);
//        t1.start();
//       t1.interrupt();
       // test.end();
//
//        System.out.println("end of main");

        MonitorExample me = new MonitorExample();
        Thread tr = new Thread(me);
        tr.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        me.sendMessage("Hi");

    }

}
