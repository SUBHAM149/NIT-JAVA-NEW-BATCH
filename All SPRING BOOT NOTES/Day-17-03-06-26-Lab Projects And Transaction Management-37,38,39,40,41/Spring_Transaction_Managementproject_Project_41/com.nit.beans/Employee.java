package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private IDCard idCard;

    public void saveEmployee() {
        System.out.println("Employee Details Saved");
        idCard.saveCard();
    }
}
