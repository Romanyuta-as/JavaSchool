package Исключения;


class Engine{
    void StartEngine(){
        System.out.println("Engine start");
    }
}
class  Vehicle{
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void StartEngine(){
        engine.StartEngine();
    }
}
/**
 * Created by Student on 26.07.2016.
 */
public class NPETest {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Vehicle car = new Vehicle();
        car.setEngine(engine);
        Vehicle bike = new Vehicle();
        bike.setEngine(engine);
        car.StartEngine();
        bike.StartEngine();
        System.out.print("All engines starts");
    }
}
