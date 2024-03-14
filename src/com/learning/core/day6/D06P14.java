package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Objects;

class Employee4 {
    private int id;
    private String name;
    private String department;
    private String designation;

    
    public Employee4() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee4(int id, String name, String department, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.designation = designation;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public int hashCode() {
		return Objects.hash(department, designation, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee4 other = (Employee4) obj;
		return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
				&& id == other.id && Objects.equals(name, other.name);
	}


	@Override
    public String toString() {
        return id + " " + name + " " + department + " " + designation;
    }
}

class D06P14{
public static void main(String[] args) {
    Hashtable<Integer, Employee4> employeeTable = new Hashtable<>();

    employeeTable.put(1001, new Employee4(1001, "Daniel", "Analyst", "L&D"));
    employeeTable.put(1002, new Employee4(1002, "Thomas", "Tester", "Testing"));
    employeeTable.put(1003, new Employee4(1003, "Robert", "Product Manager", "Development"));
    employeeTable.put(1004, new Employee4(1004, "Grace", "Tech Support", "HR"));

    Hashtable<Integer, Employee4> currentCollection = new Hashtable<>();
    currentCollection.put(1005, new Employee4(1005, "Charles", "QA Lead", "Testing"));
    currentCollection.put(1006, new Employee4(1006, "Henry", "Accountant", "Finance"));

    employeeTable.putAll(currentCollection);

    for (Employee4 employee : employeeTable.values()) {
        System.out.println(employee);
    }
}
}
