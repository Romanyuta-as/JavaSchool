package HomeWork.HW18.Decorator;

/**
 * Created by 1 on 11.09.2016.
 */
public class StandartEdition implements Computer {
    @Override
    public int getPrice() {
        return 28800;
    }

    @Override
    public String getComplete() {
        return "standard assembly of the computer!!";
    }
}
