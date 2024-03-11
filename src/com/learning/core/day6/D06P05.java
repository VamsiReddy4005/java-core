package com.learning.core.day6;

import java.util.Objects;
import java.util.TreeMap;

class Car implements Comparable<Car4> {
    private String name;
    private double price;

    
    public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    public Car(String name, double price) {
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
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car4 other = (Car4) obj;
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
    @Override
	public String toString() {
		return name+" "+price;
	}

	@Override
    public int compareTo(Car4 other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P05 {
    public static void main(String[] args) {
        TreeMap<Car4, Double> carMap = new TreeMap<>();

        carMap.put(new Car4("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car4("Swift", 305000.0), 305000.0);
        carMap.put(new Car4("Audi", 600100.0), 600100.0);
        carMap.put(new Car4("Benz", 900000.0), 900000.0);

        System.out.println("Output:");
        for (Car4 car : carMap.keySet()) {
            System.out.println(car);
        }
    }
}

