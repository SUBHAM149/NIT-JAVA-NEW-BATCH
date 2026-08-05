package com.sub.bank.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.bank.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    // Find account by email
    Optional<Account> findByEmail(String email);

    // Find account by mobile number
    Optional<Account> findByMobile(String mobile);

    // Find accounts by account type
    List<Account> findByAccountType(String accountType);

    // Check if email already exists
    boolean existsByEmail(String email);

    // Check if mobile number already exists
    boolean existsByMobile(String mobile);

}
