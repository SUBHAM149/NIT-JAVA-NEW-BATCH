package com.nit.banking;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BankAccount {

    @Value("${Account_holderName}")
    private String holderName;

    @Value("${Account_number}")
    private long accountNumber;

    @Value("${Current_balance}")
    private long currentBalance;

    @Value("${Withdraw_amount}")
    private long withdrawAmount;

    @Value("${Deposit_amount}")
    private long depositAmount;

    // Method-1
    public long withdraw() {

        if (currentBalance >= withdrawAmount) {

            currentBalance = currentBalance - withdrawAmount;

            System.out.println("Withdraw Successful...");
        } else {

            System.out.println("Insufficient Balance...");
        }

        return currentBalance;
    }

    // Method-2
    public long deposit() {

        currentBalance = withdraw();

        currentBalance = currentBalance + depositAmount;

        return currentBalance;
    }

    public void display() {

        System.out.println("Account Holder Name : " + holderName);
        System.out.println("Account Number      : " + accountNumber);
        System.out.println("Current Balance     : " + currentBalance);
        System.out.println("Withdraw Amount     : " + withdrawAmount);
        System.out.println("Deposit Amount      : " + depositAmount);
        System.out.println("Final Balance       : " + deposit());

    }

}
