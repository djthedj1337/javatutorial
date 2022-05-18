package com.jin.rose;


public class CheckingsAccount{
    private int balance;
    private int accountnumber;

    public CheckingsAccount(int accountnumber){
        this.accountnumber = accountnumber;
    }

    public void deposit(int amount){
        System.out.println("Depositing $" + amount+"...");
        balance += amount;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            int difference = amount - balance;
            throw new InsufficientFundsException(difference);
        }
    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountnumber;
    }

    public void setAccountNumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }
}
