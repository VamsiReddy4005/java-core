package com.learning.core.day10;

public class UserProfile {

    public boolean validateUsername(String name) 
    {
        return name.matches("[a-zA-Z]+");
    }

    public boolean validatePassword(String password) 
    {
        return password.matches("[a-zA-Z0-9]{8}");
    }
}

