package com.nit.beans;

public class Engine {

    private String e_name;
    private double price;

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Engine [e_name=" + e_name +
               ", price=" + price + "]";
    }
}
