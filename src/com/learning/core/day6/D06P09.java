package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car5 implements Comparable<Car5> {
    private String name;
    private double price;

    public Car5() {
    		super();
    		// TODO Auto-generated constructor stub
    	}

    public Car5(String name, double price) {
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
            Car5 car = (Car5) obj;
            return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    	}

   	@Override
   	public String toString() {
            return name + " " + price;
        }

    @Override
    public int compareTo(Car5 other) {
            return Double.compare(this.price, other.price);
        }
    
}
public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car5, String> carMap = new TreeMap<>();

        carMap.put(new Car5("Bugatti", 80050.0), "Bugatti Details");
        carMap.put(new Car5("Swift", 305000.0), "Swift Details");
        carMap.put(new Car5("Audi", 600100.0), "Audi Details");
        carMap.put(new Car5("Benz", 900000.0), "Benz Details");

        double keyToReplace = 80050.0;
        Car5 key = carMap.keySet().stream()
                .filter(car -> car.getPrice() == keyToReplace)
                .findFirst()
                .orElse(null);

        if (key != null) {
            carMap.replace(key, "Reva " + keyToReplace);
            System.out.println(carMap.get(key));
        }
    }
}