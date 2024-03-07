package com.learning.core.day4;

import java.util.Scanner;

class CricketRating {
    String playerName;
    float critic1;
    float critic2;
    float critic3;
    float avgRating;
    String coins;

    CricketRating(String playerName, float critic1, float critic2) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    CricketRating(String playerName, float critic1, float critic2, float critic3) {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    void calculateAverageRating(float critic1, float critic2) {
        this.avgRating = (critic1 + critic2) / 2;
    }

    void calculateAverageRating(float critic1, float critic2, float critic3) {
        this.avgRating = (critic1 + critic2 + critic3) / 3;
    }

    String calculateCoins() {
        if (avgRating >= 7.0) {
            return "Gold";
        } else if (avgRating >= 5.0 && avgRating < 7.0) {
            return "Silver";
        } else if (avgRating >= 2.0 && avgRating < 5.0) {
            return "Copper";
        } else {
            throw new NotEligibleException("Not Eligible");
        }
    }

    void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}

class NotEligibleException extends RuntimeException {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class D04P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String playerName = scanner.next();
        
        float critic1 = scanner.nextFloat();
        
        float critic2 = scanner.nextFloat();

        try {
            
            CricketRating player = new CricketRating(playerName, critic1, critic2);
            player.display();
        } catch (NotEligibleException e) {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}