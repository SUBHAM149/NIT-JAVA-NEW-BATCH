package com.sub.bank.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.sub.bank.dto.TransferRequest;
import com.sub.bank.entity.Account;
import com.sub.bank.service.BankService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
@Validated
@Tag(name = "Bank Management API", description = "REST APIs for Banking Application")
public class BankController {

	private final BankService bankService;

	// Create Account
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(summary = "Create a new bank account")
	public Account createAccount(@Valid @RequestBody Account account) {
		return bankService.createAccount(account);
	}

	// Get All Accounts
	@GetMapping
	@Operation(summary = "Get all bank accounts")
	public List<Account> getAllAccounts() {
		return bankService.getAllAccounts();
	}

	// Get Account By ID
	@GetMapping("/{id}")
	@Operation(summary = "Get account by ID")
	public Account getAccountById(@PathVariable("id") Long id) {

		return bankService.getAccountById(id);
	}

	// Update Account
	@PutMapping("/{id}")
	@Operation(summary = "Update account details")
	public Account updateAccount(@PathVariable("id") Long id, @Valid @RequestBody Account account) {

		return bankService.updateAccount(id, account);
	}

	// Delete Account
	@DeleteMapping("/{id}")
	@Operation(summary = "Delete account")
	public String deleteAccount(@PathVariable Long id) {
		return bankService.deleteAccount(id);
	}

	// Deposit Money
	@PutMapping("/deposit/{id}/{amount}")
	@Operation(summary = "Deposit money into an account")
	public Account deposit(@PathVariable Long id, @PathVariable Double amount) {

		return bankService.deposit(id, amount);
	}

	// Withdraw Money
	@PutMapping("/withdraw/{id}/{amount}")
	@Operation(summary = "Withdraw money from an account")
	public Account withdraw(@PathVariable Long id, @PathVariable Double amount) {

		return bankService.withdraw(id, amount);
	}

	// Transfer Money
	@PutMapping("/transfer")
	@Operation(summary = "Transfer money between two accounts")
	public String transferMoney(@Valid @RequestBody TransferRequest request) {

		return bankService.transferMoney(request);
	}

	// Get Accounts By Type
	@GetMapping("/type/{accountType}")
	@Operation(summary = "Get accounts by account type")
	public List<Account> getAccountsByType(@PathVariable String accountType) {

		return bankService.getAccountsByType(accountType);
	}

}
