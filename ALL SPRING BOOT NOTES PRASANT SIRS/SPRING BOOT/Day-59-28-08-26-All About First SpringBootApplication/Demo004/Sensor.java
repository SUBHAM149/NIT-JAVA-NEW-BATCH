package com.example.demo.FirstApp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Sensor {

    @Value("${sensorActivate}")
    private boolean isSensorActivate;

    @Value("${chipName}")
    private String chipName;

    public Sensor() {
        super();
    }

    public boolean isSensorActivate() {
        return isSensorActivate;
    }

    public void setSensorActivate(boolean isSensorActivate) {
        this.isSensorActivate = isSensorActivate;
    }

    public String getChipName() {
        return chipName;
    }

    public void setChipName(String chipName) {
        this.chipName = chipName;
    }

    @Override
    public String toString() {
        return "Sensor [isSensorActivate="
                + isSensorActivate
                + ", chipName="
                + chipName
                + "]";
    }
}
