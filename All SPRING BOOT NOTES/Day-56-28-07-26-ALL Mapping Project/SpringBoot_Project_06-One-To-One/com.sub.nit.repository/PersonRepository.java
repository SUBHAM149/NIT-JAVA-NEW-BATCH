package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.entity.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
