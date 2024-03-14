package com.learning.core.day5;

import java.util.*;

class Person3 implements Comparable<Person3> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person3(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person3 person = (Person3) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0 && name.equals(person.name);
    }

    @Override
    public int compareTo(Person3 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P07 {
    public static void main(String[] args) {
        TreeSet<Person3> personSet = new TreeSet<>();

        personSet.add(new Person3(1, "Jerry", 30, 999.0));
        personSet.add(new Person3(2, "Smith", 25, 2999.0));
        personSet.add(new Person3(3, "Рореуе", 35, 5999.0));
        personSet.add(new Person3(4, "Jones", 40, 6999.0));
        personSet.add(new Person3(5, "John", 32, 1999.0));
        personSet.add(new Person3(6, "Tom", 42, 3999.0));

        for (Person3 person : personSet) {
            System.out.println(person);
        }
    }
}