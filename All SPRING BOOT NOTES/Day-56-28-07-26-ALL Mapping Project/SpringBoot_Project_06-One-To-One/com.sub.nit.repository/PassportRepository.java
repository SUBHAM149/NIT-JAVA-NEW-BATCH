package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sub.nit.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
