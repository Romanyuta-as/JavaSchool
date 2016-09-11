package HomeWork.HW18.Decorator;

/**
 * Created by 1 on 11.09.2016.
 */
public class NvidiaTitan extends Assembly {
    public NvidiaTitan(Computer comp) {
        super(comp);
    }

    @Override
    public int getPrice() {
        return computer.getPrice()+40000;
    }

    @Override
    public String getComplete() {
        return computer.getComplete()+"with video card Nvidia Titan";
    }
}
