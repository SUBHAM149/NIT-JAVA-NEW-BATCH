package com.sub.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
