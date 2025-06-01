package com.mycompany.problem_1;

public class User {
    private String userId;
    private String name;
    private String pin;

    public User(String userId, String name, String pin) {
        this.userId = userId;
        this.name = name;
        this.pin = pin;
    }

    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
