package com.cts.assignment.model;

import com.cts.assignment.exception.*;

/*
 * Create a sub class SBAccount which extends Account class with the following fields:
 * minBalance as double
 * and a method withdraw which deducts the amount from the balance and adds a debit transaction to the list of transactions
 * and throws InsufficientBalanceException if the amount is not available in the account
 */
public class SBAccount extends Account {
    private double minBalance;

    public SBAccount(int accountNumber, double balance, double minBalance) {
        super(accountNumber, balance);
        this.minBalance = minBalance;
    }
    // constructor with all paramter with transactions
    public SBAccount(int accountNumber, double balance, double minBalance, java.util.List<Transaction> transactions) {
        super(accountNumber, balance);
        this.minBalance = minBalance;
        this.setTransactions(transactions);
    }

    public double getMinBalance() {
        return this.minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (this.getBalance() - amount < this.minBalance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        this.setBalance(this.getBalance() - amount);
        Transaction transaction = new Transaction.Builder().type(Transaction.Type.DEBIT).amount(amount).build();
        this.getTransactions().add(transaction);
    }

    public String getAccountDetails() {
        return "Account Number: " + this.getAccountNumber() + " Balance: " + this.getBalance() + " Opening Date: "
                + this.getOpeningDate() + " Min Balance: " + this.getMinBalance();
    }

    //toString
    public String toString() {
        return "Account Number: " + this.getAccountNumber() + ", Balance: " + this.getBalance() + ", Opening Date: "
                + this.getOpeningDate() + ", Min Balance: " + this.getMinBalance();
    }

}