package com.company;

public class Account {
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name = name;

        if(balance > 0.0){
           this.balance = balance;
        }
    }

    public void Deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance +depositAmount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void withdrawal(double withdrawalAmount){
        if(withdrawalAmount<balance){
            balance = balance-withdrawalAmount;
        }
        else {
            System.out.println("Withdrawal amount exceeded balance");
        }
    }
}
