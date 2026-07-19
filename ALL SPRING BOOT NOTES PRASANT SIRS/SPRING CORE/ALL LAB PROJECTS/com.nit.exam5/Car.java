package com.nit.exam5;

public class Car {

    private int carId;
    private String carName;
    private String model;
    private String color;
    private double price;

   
    private Engine engine;

    public Car() {
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void display() {

        System.out.println("========= Car Details =========");
        System.out.println("Car ID      : " + carId);
        System.out.println("Car Name    : " + carName);
        System.out.println("Model       : " + model);
        System.out.println("Color       : " + color);
        System.out.println("Price       : " + price);

        System.out.println();
        System.out.println(engine);
    }
}
