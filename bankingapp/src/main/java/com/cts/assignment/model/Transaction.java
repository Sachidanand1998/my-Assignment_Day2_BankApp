package com.cts.assignment.model;

/*
 * Create Transaction class with the following fields:
 * date as java LocalDate object
 * type as enum with 'debit' and 'credit'
 * amount as double
 * create a builder class for the Transaction class to create Transaction objects
 */
public class Transaction {
    private java.time.LocalDate date;
    private Type type;
    private double amount;

    public Transaction(Type type, double amount) {
        this.date = java.time.LocalDate.now();
        this.type = type;
        this.amount = amount;
    }

    public java.time.LocalDate getDate() {
        return this.date;
    }

    public Type getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public static class Builder {
        private Type type;
        private double amount;

        public Builder() {
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Transaction build() {
            return new Transaction(this.type, this.amount);
        }
    }

    public enum Type {
        DEBIT, CREDIT
    }
}