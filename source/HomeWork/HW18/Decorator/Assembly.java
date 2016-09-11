package HomeWork.HW18.Decorator;

/**
 * Created by 1 on 11.09.2016.
 */
public class Assembly implements Computer {
    protected final Computer computer;

    public Assembly(Computer comp) {
        this.computer = comp;
    }

    @Override
    public int getPrice() {
        return computer.getPrice();
    }

    @Override
    public String getComplete() {
        return computer.getComplete();
    }
}
