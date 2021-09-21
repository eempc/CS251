package com.meow.interfacebank;

public interface BankAccount {
    void setAccountNumber(String accountNumber);
    void setBalance(float balance);
    String getAccountNumber();
    float getBalance();
    void deposit(float amount);
    boolean withdraw(float amount);
}
