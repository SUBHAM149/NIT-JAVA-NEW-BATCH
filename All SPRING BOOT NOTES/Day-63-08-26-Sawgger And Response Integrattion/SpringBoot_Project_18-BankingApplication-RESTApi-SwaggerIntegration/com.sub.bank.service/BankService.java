package com.sub.bank.service;

import java.util.List;

import com.sub.bank.dto.TransferRequest;
import com.sub.bank.entity.Account;

public interface BankService {

    // Create New Account
    Account createAccount(Account account);

    // Get All Accounts
    List<Account> getAllAccounts();

    // Get Account By ID
    Account getAccountById(Long accountId);

    // Update Account Details
    Account updateAccount(Long accountId, Account account);

    // Delete Account
    String deleteAccount(Long accountId);

    // Deposit Money
    Account deposit(Long accountId, Double amount);

    // Withdraw Money
    Account withdraw(Long accountId, Double amount);

    // Transfer Money
    String transferMoney(TransferRequest request);

    // Get Accounts By Type
    List<Account> getAccountsByType(String accountType);

}
