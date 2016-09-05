package Lesson17;

import lesson11_2.*;

/**
 * Created by Student on 05.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Document d = new Document(new RealDocExecImpl());
        Account accA = new Account();
        DocumentExecutor documentExecutor = new DocumentExecutor();
        accA.setSaldo(100L);
        Account accB = new Account();
        accB.setSaldo(0L);
        d.setAccA(accA);
        d.setAccB(accB);
        d.setSumma(10L);
        documentExecutor.exec(d);
    }
}
