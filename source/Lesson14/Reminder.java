package Lesson14;

import HomeWork.HomeWork11.ThreadClass;

/**
 * Created by Student on 25.08.2016.
 */
public class Reminder implements Runnable {
    @Override
    public void run() {
        System.out.println("From run "+ Thread.currentThread().getName());
    }
}
