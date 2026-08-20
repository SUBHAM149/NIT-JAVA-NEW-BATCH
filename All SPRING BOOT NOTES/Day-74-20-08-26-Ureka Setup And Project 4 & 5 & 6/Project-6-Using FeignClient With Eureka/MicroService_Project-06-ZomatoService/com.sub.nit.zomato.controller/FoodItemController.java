package com.sub.nit.zomato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.zomato.entity.FoodItem;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {

    @GetMapping("/{id}")
    public FoodItem getFoodItem(@PathVariable int id) {

        return new FoodItem(101, "Biryani", 250);
    }
}
