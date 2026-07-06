package com.sub.program02;

public class Employee {

    private String name;
    private int id;
    private Address address;

    public Employee() {
        System.out.println("Employee Object Created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name Setter Called");
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("ID Setter Called");
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Address Reference Setter Called");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name +
                ", id=" + id +
                ", address=" + address + "]";
    }

}
