package com.nit.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Principal {

    @Value("101")
    private int principalId;

    @Value("Ramesh Sir")
    private String principalName;

    @Override
    public String toString() {
        return "Principal [principalId=" + principalId +
                ", principalName=" + principalName + "]";
    }
}
