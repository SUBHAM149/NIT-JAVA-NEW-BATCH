package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ad")
public class Adress {

    @Value("Balasore")
    private String city;

    @Value("Odisha")
    private String state;

    

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Adress [city=" + city + ", state=" + state + "]";
    }
}
