
package com.mycompany.problem_1;

// ATM.java
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class ATM {
    private Bank bank;
    private ArrayList<Transaction> transactionLog;

    public ATM(Bank bank) {
        this.bank = bank;
        this.transactionLog = new ArrayList<>();
    }

    public boolean authenticateUser(User user, String pin) {
        return user.validatePin(pin);
    }

    public void withdraw(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null && account.withdraw(amount)) {
            logTransaction("Withdraw", amount, accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        Account account = bank.getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            logTransaction("Deposit", amount, accountNumber);
        }
    }

    public void transfer(String fromAcc, String toAcc, double amount) {
        Account from = bank.getAccount(fromAcc);
        Account to = bank.getAccount(toAcc);
        if (from != null && to != null) {
            from.transfer(to, amount);
            logTransaction("Transfer", amount, fromAcc);
        }
    }

    public void printTransactionLog() {
        for (Transaction t : transactionLog) {
            System.out.println(t.getSummary());
        }
    }

    private void logTransaction(String type, double amount, String accNumber) {
        String id = UUID.randomUUID().toString();
        transactionLog.add(new Transaction(id, new Date(), type, amount, accNumber));
    }
}
