package Lesson19;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Student on 12.09.2016.
 */
// паттерн Наблюдатель
public class Client {
    public static void main(String[] args) {
        MeteoStation meteo = new MeteoStation();
        Observer cons = new ConsoleObserver();
        meteo.addObserver(cons);
        meteo.setData(11,365);
        //cons.onChange(meteo.temp,meteo.pressure);
    }
}
interface Observable{
    void notifyObservers(int temp, int pressure);
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}

interface Observer{
    void onChange(int temp, int pressure);
}
class MeteoStation implements Observable{
    List<Observer> observerList = new ArrayList<>();
    int temp;
    int pressure;
    void setData(int temp, int pressure){
        this.temp = temp;
        this.pressure = pressure;
        this.notifyObservers(temp, pressure);
    }

    @Override
    public void notifyObservers(int temp, int pressure) {
        for(Observer observer: observerList){
            observer.onChange(temp, pressure);
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }
}

class ConsoleObserver implements Observer{

    @Override
    public void onChange(int temp, int pressure) {
        System.out.println("Temp: "+temp + "------"+ pressure);
    }
}