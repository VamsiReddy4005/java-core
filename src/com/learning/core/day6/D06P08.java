package com.learning.core.day6;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;


class Car4 implements Comparable<Car4> {
    private String name;
    private double price;

    public Car4() {
    		super();
    		// TODO Auto-generated constructor stub
    	}

    public Car4(String name, double price) {
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
            Car4 car = (Car4) obj;
            return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    	}

   	@Override
   	public String toString() {
            return name + " " + price;
        }

    @Override
    public int compareTo(Car4 other) {
            return Double.compare(this.price, other.price);
        }
    
}
public class D06P08 {
    public static void main(String[] args) {
        TreeMap<Car4, String> carMap = new TreeMap<>();

        carMap.put(new Car4("Bugatti", 80050.0), "Bugatti Details");
        carMap.put(new Car4("Swift", 305000.0), "Swift Details");
        carMap.put(new Car4("Audi", 600100.0), "Audi Details");
        carMap.put(new Car4("Benz", 900000.0), "Benz Details");

        Map.Entry<Car4, String> greatestEntry = carMap.lastEntry();
        carMap.remove(greatestEntry.getKey());
        for(Map.Entry<Car4,String>entry:carMap.entrySet())
        {
        System.out.println(entry.getKey());
        }
    }
}
