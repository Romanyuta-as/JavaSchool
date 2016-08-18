package lesson11_2;

/**
 * Created by Student on 18.08.2016.
 */
public class Account implements Runnable {
    private int saldo;
    private final Object myLock = new Object();
    public Account(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public   void decreaseSaldo(int sum){
        System.out.println("log");

        synchronized(myLock) {//используем синхронизацию потока для определенного участка кода
            if (saldo - sum < 0) {
                System.out.println("overdraft not avialable!");

            } else {

                saldo = saldo - sum;
                System.out.println(saldo + "   " + Thread.currentThread().getName());
            }
        }
        //Object o = new Object();
       // o.notify();
    }

    @Override
    public void run() {
        int x =12;
        for (int i=0;i<x;i++){
            decreaseSaldo(10);
            if(getSaldo()<0){
                throw  new RuntimeException("current account overdraft");
            }
        }

    }
}
