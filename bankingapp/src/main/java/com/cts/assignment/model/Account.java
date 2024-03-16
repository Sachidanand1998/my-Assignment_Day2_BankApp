package com.cts.assignment.model;

import java.util.List;

import com.cts.assignment.exception.*;

/*
 * Create an abstract class Account with the following fields:
 * accountNumber as integer
 * balance as double
 * openingDate as java LocalDate object
 * list of transactions as List of Transaction objects
 * 
 * Create below methods in the Account class:
 * deposit method to add credit transaction to the list of transactions for each deposit
 * getAccountDetails method which returns a string with account details
 */
public abstract class Account {
    private int accountNumber;
    private double balance;
    private java.time.LocalDate openingDate;
    private List<Transaction> transactions;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openingDate = java.time.LocalDate.now();
    }

    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    //setter
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public java.time.LocalDate getOpeningDate() {
        return this.openingDate;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    //setter
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction transaction = new Transaction.Builder().type(Transaction.Type.CREDIT).amount(amount).build();
        this.transactions.add(transaction);
    }

    public abstract String getAccountDetails();

    // tostring
    public String toString() {
        return "Account Number: " + this.getAccountNumber() + ", Balance: " + this.getBalance() + ", Opening Date: "
                + this.getOpeningDate();
    }
}