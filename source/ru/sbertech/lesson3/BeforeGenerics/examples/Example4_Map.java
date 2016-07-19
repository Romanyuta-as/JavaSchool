package ru.sbertech.lesson3.BeforeGenerics.examples;

import ru.sbertech.lesson3.BeforeGenerics.Person;
import ru.sbertech.lesson3.BeforeGenerics.PersonFirstLoad;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

/**
 * Created by Student on 19.07.2016.
 */
public class Example4_Map {
    public static void main(String[] args)
    {
        Map<String,Person> persons = new HashMap<>();
        PersonFirstLoad.init(persons);
        PersonFirstLoad.print(persons);
        System.out.print("size: "+persons.size());
    }
}
