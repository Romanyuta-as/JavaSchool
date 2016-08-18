package lesson11_2;

/**
 * Created by Student on 18.08.2016.
 */
public class MonitorExample implements Runnable{
    private String messsage;



    public void doMessage(){
       synchronized (this){
           while(messsage == null){
               try {
                   wait();
                   System.out.println(messsage);
                   //this.messsage = null;
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
    }

    public void sendMessage(String messsage){
        synchronized (this){
            this.messsage = messsage;
            notify();

        }
    }

    @Override
    public void run() {
        doMessage();
    }
}
