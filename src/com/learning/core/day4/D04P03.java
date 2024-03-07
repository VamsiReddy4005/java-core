package com.learning.core.day4;

import java.util.Scanner;

class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

class InvalidNameException extends CatheyBankException {
    public InvalidNameException() {
        super("Invalid Applicant Name");
    }
}

class InvalidPostException extends CatheyBankException {
    public InvalidPostException() {
        super("Invalid Post");
    }
}

class InvalidAgeException extends CatheyBankException {
    public InvalidAgeException() {
        super("Invalid Age");
    }
}

class Validator {
    public static void validateApplicant(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.applicantName)) {
            throw new InvalidNameException();
        }
        if (!isValidPost(applicant.postApplied)) {
            throw new InvalidPostException();
        }
        if (!isValidAge(applicant.applicantAge)) {
            throw new InvalidAgeException();
        }
        System.out.println("All details are valid");
    }

    public static boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

    public static boolean isValidPost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

    public static boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

class Applicant {
    String applicantName;
    String postApplied;
    int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }
}

public class D04P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.next();
        String post = scanner.next();
        int age = scanner.nextInt();

        Applicant applicant = new Applicant(name, post, age);

        try {
            Validator.validateApplicant(applicant);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }
    }
}
