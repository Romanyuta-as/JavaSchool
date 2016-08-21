package HomeWork.HomeWork11_2;

/**
 * Created by 1 on 21.08.2016.
 */
public class Task {
    int max;
    int summaCheta;
    private final Object myobj = new Object();
    public Task(int max, int summaCheta) {
        this.max = max;
        this.summaCheta = summaCheta;
    }

    public  void addBalance(int money){
        System.out.println(" Операция добавления началась");
        synchronized (myobj){
            if(summaCheta+money>max){
                //System.out.println("Операция не может быть выполнена так как счет превысит лимит -----"+ Thread.currentThread().getName());
                new RuntimeException();
            }
            else {
                summaCheta = summaCheta+money;
                System.out.println("Баланс пополнен на "+ money +" y.e -------"+Thread.currentThread().getName());
            }
        }
    }

    public  void removeBalance(int money){
        System.out.println(" Операция списания началась");
        synchronized (myobj){
            if(summaCheta-money<0){
                new RuntimeException();
            }
            else {
                summaCheta = summaCheta+money;
                System.out.println("Баланс списан на "+ money +" y.e -------"+Thread.currentThread().getName());
            }
        }
    }

}
