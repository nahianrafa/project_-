
package com.mycompany.problem_1;

// Bank.java
import java.util.HashMap;

public class Bank {
    private String bankName;
    private HashMap<String, Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public String getBankName() {
        return bankName;
    }
}
