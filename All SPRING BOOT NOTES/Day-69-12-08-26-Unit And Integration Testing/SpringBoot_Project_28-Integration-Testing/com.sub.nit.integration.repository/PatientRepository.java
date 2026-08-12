package com.sub.nit.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.integration.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
