package lesson11_2;

/**
 * Created by Student on 18.08.2016.
 */
public class Test implements Runnable {
    private boolean endFlag= false;
    public void end(){
        endFlag=true;
    }
    @Override
    public void run(){
        while(!endFlag){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }
    }
}
