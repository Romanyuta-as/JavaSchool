package Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class InfoDocExecImpl implements ExecBehavior{
    @Override
    public void exec(Document d) {
        System.out.println("This is InfoDoc");
    }
}
