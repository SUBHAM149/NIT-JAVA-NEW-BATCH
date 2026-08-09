package com.sub.day24;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("forAllCustomer")
@Scope("prototype")
@PropertySource("classpath:com/sub/day24/application24.properties")
@DependsOn("bankServerStartup")
public class BankOperation {

    @Value("${Bank_UserName}")
    private String userName;

    @Value("${Bank_AccNumber}")
    private String accNumber;

    @Value("${Bank_currentBalance}")
    private long accountBalance;

    public BankOperation() {

        System.out.println("Bank operation all set to start");
    }

    public void deposite(long amount) {

        if (amount > 0) {
            accountBalance = accountBalance + amount;
            System.out.println("Amount added successfully");
        } else {
            System.err.println("Enter the valid amount");
        }
    }

    public void withdraw(long amount) {

        if (accountBalance >= amount && amount > 0) {
            accountBalance -= amount;
            System.out.println("Amount withdraw");
        } else {
            System.err.println("Invalid amount or Insufficient funds");
        }
    }

    public void showBalance() {

        System.out.println("current Balance is " + accountBalance);
    }
}
