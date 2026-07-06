package com.sub.program02;

public class Address {

    private String city;
    private int pincode;

    public Address() {
        System.out.println("Address Object Created");
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("City Setter Called");
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        System.out.println("Pincode Setter Called");
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + ", pincode=" + pincode + "]";
    }

}
