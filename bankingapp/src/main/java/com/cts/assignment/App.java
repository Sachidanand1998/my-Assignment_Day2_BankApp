package com.cts.assignment;

import java.util.ArrayList;

import com.cts.assignment.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        /* create FDAccount maturityDate as LocalDate
        * interestRate as double
        * and create below methods
        * getTenure - to return the tenure of the FD in monthswith list object  print result
            */
        com.cts.assignment.model.FDAccount fDAccount = new com.cts.assignment.model.FDAccount(2, 1000, java.time.LocalDate.now().plusMonths(12), 0.05,new ArrayList<Transaction>());
        System.out.println(fDAccount.getTenure());
        System.out.println(fDAccount.getMaturityAmount());
        System.out.println(fDAccount.getAccountDetails());

        // create account SBAccount print result
        com.cts.assignment.model.SBAccount sBAccount = new com.cts.assignment.model.SBAccount(1, 1000, 500, new ArrayList<Transaction>());
        try {
            sBAccount.withdraw(100);
        } catch (com.cts.assignment.exception.InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sBAccount.getAccountDetails());


        
    }
}