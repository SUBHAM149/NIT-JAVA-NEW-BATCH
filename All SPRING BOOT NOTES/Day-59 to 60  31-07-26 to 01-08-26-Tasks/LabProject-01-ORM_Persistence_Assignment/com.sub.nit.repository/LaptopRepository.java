package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.nit.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
