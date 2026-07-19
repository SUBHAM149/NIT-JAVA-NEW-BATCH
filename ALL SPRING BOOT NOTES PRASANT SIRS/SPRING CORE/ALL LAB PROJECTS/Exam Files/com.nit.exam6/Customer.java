package com.nit.exam6;

public class Customer {

    private int customerId;
    private String customerName;
    private String accountNumber;
    private String accountType;
    private double balance;
    private String mobileNumber;

    public Customer() {
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Customer Details\n" +
               "Customer ID   : " + customerId + "\n" +
               "Customer Name : " + customerName + "\n" +
               "Account No    : " + accountNumber + "\n" +
               "Account Type  : " + accountType + "\n" +
               "Balance       : " + balance + "\n" +
               "Mobile Number : " + mobileNumber;
    }
}
