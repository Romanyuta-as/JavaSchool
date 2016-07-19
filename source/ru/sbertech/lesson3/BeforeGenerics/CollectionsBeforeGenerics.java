package ru.sbertech.lesson3.BeforeGenerics;

import java.util.ArrayList;

/**
 * Created by Student on 19.07.2016.
 */
public class CollectionsBeforeGenerics {
    public static void  main(String[] args)
    {
        ArrayList<Apple> apples = new ArrayList();
        for(int i=0;i<3;i++) {
            apples.add(new Apple());
        }
        for(int i=0;i<3;i++)
        {
            System.out.print(( apples.get(i)).getId());//достаем id из списка
        }
    }
}
