package com.sub.nit.mockito.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sub.nit.mockito.entity.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
