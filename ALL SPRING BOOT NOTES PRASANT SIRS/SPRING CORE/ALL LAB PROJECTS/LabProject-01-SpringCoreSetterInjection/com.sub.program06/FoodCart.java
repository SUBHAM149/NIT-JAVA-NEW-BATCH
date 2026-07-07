package com.sub.program06;

import java.util.List;

public class FoodCart {

    private List<String> dishes;

    public FoodCart() {
        super();
    }

    public List<String> getDishes() {
        return dishes;
    }

    public void setDishes(List<String> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "FoodCart [dishes=" + dishes + "]";
    }
}
