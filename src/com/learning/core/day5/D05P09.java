package com.learning.core.day5;

import java.util.*;

class Person6 implements Comparable<Person6> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person6(int id, String name, int age, double salary) {
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
        Person6 person = (Person6) obj;
        return id == person.id && age == person.age && Double.compare(person.salary, salary) == 0 && name.equals(person.name);
    }

    @Override
    public int compareTo(Person6 o) {
        return Integer.compare(this.id, o.id);
    }

    public double getSalary() {
        return salary;
    }
}

public class D05P09 {
    public static void main(String[] args) {
        TreeSet<Person6> personSet = new TreeSet<>();

        personSet.add(new Person6(1, "Jerry", 30, 999.0));
        personSet.add(new Person6(2, "Smith", 25, 2999.0));
        personSet.add(new Person6(3, "Popeye", 35, 5999.0));
        personSet.add(new Person6(4, "Jones", 40, 6999.0));
        personSet.add(new Person6(5, "John", 32, 1999.0));
        personSet.add(new Person6(6, "Tom", 42, 3999.0));

        double sumOfSalaries = personSet.stream()
                .mapToDouble(Person6::getSalary)
                .sum();

        System.out.println(sumOfSalaries);
    }
}
