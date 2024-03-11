package com.learning.core.day6;

import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    public Car3() {
    		super();
    		// TODO Auto-generated constructor stub
    	}

    public Car3(String name, double price) {
    		super();
    		this.name = name;
    		this.price = price;
    	}

    public String getName() {
    		return name;
    	}

    public void setName(String name) {
    		this.name = name;
    	}

    public double getPrice() {
    		return price;
    	}

    public void setPrice(double price) {
    		this.price = price;
    	}

    @Override
    public int hashCode() {
    		return Objects.hash(name, price);
    	}

   	@Override
   	public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Car3 car = (Car3) obj;
            return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    	}

   	@Override
   	public String toString() {
            return name + " " + price;
        }

    @Override
    public int compareTo(Car3 other) {
            return Double.compare(this.price, other.price);
        }
    
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car3, String> carMap = new TreeMap<>();

        carMap.put(new Car3("Bugatti", 80050.0), "Bugatti Details");
        carMap.put(new Car3("Swift", 305000.0), "Swift Details");
        carMap.put(new Car3("Audi", 600100.0), "Audi Details");
        carMap.put(new Car3("Benz", 900000.0), "Benz Details");

        System.out.println(carMap.lastEntry().getKey());
        System.out.println(carMap.firstEntry().getKey());
    }
}

