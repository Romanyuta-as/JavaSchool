package Lesson17;

import lesson11_2.*;

/**
 * Created by Student on 05.09.2016.
 */
public class Document {
    private Client clientA;
    private Client clientB;
    private Long summa;
    private Account accA;
    private Account accB;
    private String user;
    private ExecBehavior execBehavior;

    public ExecBehavior getExecBehavior() {
        return execBehavior;
    }

    public void setExecBehavior(ExecBehavior execBehavior) {
        this.execBehavior = execBehavior;
    }

    public Document(ExecBehavior execBehavior) {
        this.execBehavior = execBehavior;
    }

    public Client getClientA() {
        return clientA;
    }

    public void setClientA(Client clientA) {
        this.clientA = clientA;
    }

    public Client getClientB() {
        return clientB;
    }

    public void setClientB(Client clientB) {
        this.clientB = clientB;
    }

    public Long getSumma() {
        return summa;
    }

    public void setSumma(Long summa) {
        this.summa = summa;
    }

    public Account getAccA() {
        return accA;
    }

    public void setAccA(Account accA) {
        this.accA = accA;
    }

    public Account getAccB() {
        return accB;
    }

    public void setAccB(Account accB) {
        this.accB = accB;
    }

    public void exec() {
        accA.setSaldo(accA.getSaldo() - summa);
        accB.setSaldo(accB.getSaldo() + summa);
        System.out.println("From accA to accB: " + summa);
    }

    public void print() {
        System.out.println("summa:" + summa);
    }

    public void printUserInfo() {
        System.out.println("Document user: " + user);
    }

    public void saveToDB() {
        System.out.println("Save");
    }
}
