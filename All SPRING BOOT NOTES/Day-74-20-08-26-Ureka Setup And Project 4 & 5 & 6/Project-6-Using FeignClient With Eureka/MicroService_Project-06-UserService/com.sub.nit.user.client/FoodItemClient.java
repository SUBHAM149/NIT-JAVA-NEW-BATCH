package com.sub.nit.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sub.nit.user.dto.FoodItem;

@FeignClient(name = "MicroService-Project-06-ZomatoService")
public interface FoodItemClient {

    @GetMapping("/fooditems/{id}")
    public FoodItem getFoodItem(@PathVariable int id);
}
