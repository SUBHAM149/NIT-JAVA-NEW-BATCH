package com.example.demo.FirstApp;

import org.springframework.beans.factory.annotation.Autowired;

public class Robot {

    private String roboCompany;
    private String motorPower;

    @Autowired
    private Sensor sensor;

    public Robot() {
        super();
    }

    public String getRoboCompany() {
        return roboCompany;
    }

    public void setRoboCompany(String roboCompany) {
        this.roboCompany = roboCompany;
    }

    public String getMotorPower() {
        return motorPower;
    }

    public void setMotorPower(String motorPower) {
        this.motorPower = motorPower;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "Robot [roboCompany="
                + roboCompany
                + ", motorPower="
                + motorPower
                + ", sensor="
                + sensor
                + "]";
    }
}
