
package com.mycompany.problem_1;

// Account.java
public class Account {
    private String accountNumber;
    private User owner;
    private double balance;

    public Account(String accountNumber, User owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) return false;
        balance -= amount;
        return true;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public User getOwner() {
        return owner;
    }
}
