package ru.sbertech.lesson3.BeforeGenerics;

/**
 * Created by Student on 19.07.2016.
 */
public class Apple {
    final  Long id = counter++;
    static Long counter=new Long(0L);//переменная для всего класса

    public Long getId() {
        return id;
    }
}
