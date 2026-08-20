package com.sub.nit.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sub.nit.user.client.FoodItemClient;
import com.sub.nit.user.dto.FoodItem;
import com.sub.nit.user.dto.UserRespose;
import com.sub.nit.user.entity.User;

@RestController
public class UserController {

    User u = new User(101, "Subham");

    @Autowired
    FoodItemClient client;

    @GetMapping("/user/{id}")
    public UserRespose getUser(@PathVariable int id) {

        int u_id = u.getUserId();
        String u_name = u.getUserName();

        FoodItem item = client.getFoodItem(101);

        return new UserRespose(
                u_id,
                u_name,
                item.getFood_id(),
                item.getFood_name(),
                item.getFood_price()
        );
    }
}
