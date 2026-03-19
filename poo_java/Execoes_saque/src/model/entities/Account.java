package model.entities;

import model.Exception.DomainException;

public class Account {
    int number;
    String holder;
    double balance;
    double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new DomainException("Whithdraw error: The ammount exceeds withdraw limits");
        }
        else if (amount <= 0) {
            throw new DomainException("Whithdraw error: Negative amount");
        }

        if (amount > getWithdrawLimit()) {
            throw new DomainException("Whithdraw error: The amount exceeds withdraw limits");
        }
         balance -= amount;
    }

    @Override
    public String toString() {
        return "Account" +"\n" + "number: " + number + ", holder: " + holder + ", balance: " + balance;
    }
}
