package com.learning.core.day5;

import java.util.*;

class Person7 implements Comparable<Person7> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person7(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person7 person = (Person7) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0 && name.equals(person.name);
    }

    @Override
    public int compareTo(Person7 o) {
        return Integer.compare(this.id, o.id);
    }

    public String getName() {
        return name;
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person7> personSet = new TreeSet<>();

        personSet.add(new Person7(1, "Alice", 22, 1500.0));
        personSet.add(new Person7(2, "Bob", 30, 2500.0));
        personSet.add(new Person7(3, "Charlie", 28, 1800.0));
        personSet.add(new Person7(4, "Jones", 22, 6999.0));
        personSet.add(new Person7(5, "John", 32, 1999.0));
        personSet.add(new Person7(6, "Tom", 42, 3999.0));

        Person7 firstPersonWithJ = personSet.stream()
                .filter(person -> person.getName().startsWith("J"))
                .findFirst()
                .orElse(null);

        if (firstPersonWithJ != null) {
            System.out.println(firstPersonWithJ);
        }
    }
}