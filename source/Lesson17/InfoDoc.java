package Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class InfoDoc extends Document {
    public InfoDoc(ExecBehavior execBehavior) {
        super(execBehavior);
    }

    public void exec(){
        System.out.println("This is InfoDoc");
    }
}
