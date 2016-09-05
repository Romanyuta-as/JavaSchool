package Lesson17;

/**
 * Created by Student on 05.09.2016.
 */
public class RealDocExecImpl implements ExecBehavior {

    @Override
    public void exec(Document document) {
        document.getAccA().setSaldo(document.getAccA().getSaldo() - document.getSumma());
        document.getAccA().setSaldo(document.getAccA().getSaldo() + document.getSumma());
        System.out.println("From accA to accB: " + document.getSumma());
    }
}
