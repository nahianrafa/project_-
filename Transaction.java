
package com.mycompany.problem_1;

// Transaction.java
import java.util.Date;

public class Transaction {
    private String transactionId;
    private Date date;
    private String type; // "Withdraw", "Deposit", "Transfer"
    private double amount;
    private String accountNumber;

    public Transaction(String transactionId, Date date, String type, double amount, String accountNumber) {
        this.transactionId = transactionId;
        this.date = date;
        this.type = type;
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public String getSummary() {
        return date + " | " + type + " | " + amount + " | Acc#: " + accountNumber;
    }
}
