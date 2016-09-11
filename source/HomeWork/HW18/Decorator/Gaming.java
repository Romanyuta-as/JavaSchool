package HomeWork.HW18.Decorator;

/**
 * Created by 1 on 11.09.2016.
 */
public class Gaming extends Assembly {
    public Gaming(Computer comp) {
        super(comp);
    }

    @Override
    public int getPrice() {
        return super.getPrice()+60000;
    }

    @Override
    public String getComplete() {
        return computer.getComplete()+ "with video card Nvidia Titan and  Intel Icore 7 ";
    }
}
