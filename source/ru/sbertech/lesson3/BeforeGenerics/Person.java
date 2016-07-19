package ru.sbertech.lesson3.BeforeGenerics;

/**
 * Created by Student on 19.07.2016.
 */
public class Person implements Comparable<Person> {
    long id;
    String name;
    String phoneNumber;

    public Person(long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person(id="+this.getId()+";name="+this.getName()+";phoneNumber="+this.getPhoneNumber();
    }

    @Override
    public boolean equals(Object obj) {
        return this.getId()==((Person)obj).getId();
    }

/*
    @Override
    public int hashCode() {
        return (this.getId()+this.getName()+this.getPhoneNumber()).hashCode();
    }
*/
    @Override
    public int compareTo(Person o) {
        return this.getPhoneNumber().compareTo(o.getPhoneNumber());
    }
}
