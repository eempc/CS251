package com.meow.interfacebank;

public class BasicAccount implements BankAccount {
    private String accountNumber;
    private float balance;

    public BasicAccount(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public boolean withdraw(float amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
