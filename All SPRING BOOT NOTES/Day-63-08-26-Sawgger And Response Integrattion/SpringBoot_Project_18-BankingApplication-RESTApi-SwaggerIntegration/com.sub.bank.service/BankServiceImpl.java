package com.sub.bank.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sub.bank.dto.TransferRequest;
import com.sub.bank.entity.Account;
import com.sub.bank.exception.AccountNotFoundException;
import com.sub.bank.exception.InsufficientBalanceException;
import com.sub.bank.repository.AccountRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {

	private final AccountRepository repository;

	@Override
	public Account createAccount(Account account) {

		if (repository.existsByEmail(account.getEmail())) {
			throw new RuntimeException("Email already exists.");
		}

		if (repository.existsByMobile(account.getMobile())) {
			throw new RuntimeException("Mobile number already exists.");
		}

		return repository.save(account);
	}

	@Override
	public List<Account> getAllAccounts() {
		return repository.findAll();
	}

	@Override
	public Account getAccountById(Long accountId) {

		return repository.findById(accountId)
				.orElseThrow(() -> new AccountNotFoundException("Account Not Found with ID : " + accountId));
	}

	@Override
	public Account updateAccount(Long accountId, Account account) {

		Account existing = getAccountById(accountId);

		existing.setAccountHolderName(account.getAccountHolderName());

		existing.setAccountType(account.getAccountType());

		existing.setBalance(account.getBalance());

		existing.setEmail(account.getEmail());

		existing.setMobile(account.getMobile());

		return repository.save(existing);

	}

	@Override
	public String deleteAccount(Long accountId) {

		Account account = getAccountById(accountId);

		repository.delete(account);

		return "Account Deleted Successfully.";
	}

	@Override
	public Account deposit(Long accountId, Double amount) {

		Account account = getAccountById(accountId);

		account.setBalance(account.getBalance() + amount);

		return repository.save(account);
	}

	@Override
	public Account withdraw(Long accountId, Double amount) {

		Account account = getAccountById(accountId);

		if (account.getBalance() < amount) {
			throw new InsufficientBalanceException("Insufficient Balance.");
		}

		account.setBalance(account.getBalance() - amount);

		return repository.save(account);
	}

	@Override
	@Transactional
	public String transferMoney(TransferRequest request) {

		Account sender = getAccountById(request.getSenderId());

		Account receiver = getAccountById(request.getReceiverId());

		if (sender.getBalance() < request.getAmount()) {
			throw new InsufficientBalanceException("Sender has insufficient balance.");
		}

		sender.setBalance(sender.getBalance() - request.getAmount());

		receiver.setBalance(receiver.getBalance() + request.getAmount());

		repository.save(sender);

		repository.save(receiver);

		return "Money Transferred Successfully.";
	}

	@Override
	public List<Account> getAccountsByType(String accountType) {

		return repository.findByAccountType(accountType);
	}

}
