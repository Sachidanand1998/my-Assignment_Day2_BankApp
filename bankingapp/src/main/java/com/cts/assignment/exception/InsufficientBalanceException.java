package com.cts.assignment.exception;

// Create exception class InsufficientBalanceException
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}