package com.nit.beans;

public class Customer {

    private int c_id;
    private String c_name;
    private String c_item;
    private double c_bill;

    
    public Customer() {

    }

    
    public Customer(
    int c_id,
    String c_name,
    String c_item,
    double c_bill) {

        this.c_id = c_id;
        this.c_name = c_name;
        this.c_item = c_item;
        this.c_bill = c_bill;
    }

    
    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getC_item() {
        return c_item;
    }

    public void setC_item(String c_item) {
        this.c_item = c_item;
    }

    public double getC_bill() {
        return c_bill;
    }

    public void setC_bill(double c_bill) {
        this.c_bill = c_bill;
    }

    
    @Override
    public String toString() {

        return "Customer [c_id="
        + c_id
        + ", c_name="
        + c_name
        + ", c_item="
        + c_item
        + ", c_bill="
        + c_bill
        + "]";
    }

    
    public void display() {

        System.out.println(
        "Customer ID : " + c_id);

        System.out.println(
        "Customer Name : " + c_name);

        System.out.println(
        "Customer Item : " + c_item);

        System.out.println(
        "Customer Bill : " + c_bill);
    }
}
