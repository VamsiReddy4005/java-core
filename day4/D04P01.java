package com.learning.core.day4;
import java.util.Scanner;


class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String message) {
        super(message);
    }
}

public class D04P01 {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public D04P01(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;

        if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("LowBalance");
        }

        if (initialBalance < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }

        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }

        this.balance += amt;
    }

    public float getBalance() throws LowBalanceException, NegativeAmountException {
        if (balance < 0) {
            throw new NegativeAmountException("NegativeAmount");
        }

        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
            throw new LowBalanceException("LowBalance");
        }

        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int accNo = scanner.nextInt();
            String custName = scanner.next();
            String accType = scanner.next();
            float initialBalance = scanner.nextFloat();

            D04P01 account = new D04P01(accNo, custName, accType, initialBalance);

            System.out.println(account.getBalance());

           
        } catch (LowBalanceException | NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
