package com.learning.core.day5;

import java.util.Random;

class Register<T> {
    private String registerId;

    public Register(String registerId) {
        this.registerId = registerId;
    }

    public String generateRegistrationId(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder registrationId = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < length; i++) {
            registrationId.append(characters.charAt(random.nextInt(characters.length())));
        }

        return registerId + " " + registrationId.toString();
    }

    public void display(T user) {
        if (user instanceof Employee) {
            Employee employee = (Employee) user;
            System.out.println(generateRegistrationId(6) + " " + employee.getName() + " " +
                    employee.getPhoneNo() + " " + employee.getEmployeeId() + " " + employee.getPassportNo());
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println(generateRegistrationId(6) + " " + student.getName() + " " +
                    student.getPhoneNo() + " " + student.getLicenseNo() + " " + student.getPassportNo());
        }
    }
}

class Employee {
    private String name;
    private long phoneNo;
    private int employeeId;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPassportNo() {
        return passportNo;
    }
}

class Student {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPassportNo() {
        return passportNo;
    }
}

class D05P01 {
    public static void main(String[] args) {
        Register<Employee> employeeRegister = new Register<>("ASKEWZ");
        Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");
        employeeRegister.display(employee);

        Register<Student> studentRegister = new Register<>("XSQ9EHZ");
        Student student = new Student("Joseph", 9123412780L, 2210, "SJLD1717K");
        studentRegister.display(student);
    }
}
