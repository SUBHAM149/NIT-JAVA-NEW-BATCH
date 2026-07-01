package com.nit;

public class LowQualityStreaming implements StreamingStrategy {

    private int resolution;
    private int bandwidth;

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public void streamVideo(String movieName) {
        System.out.println("Streaming " + movieName + " in " + resolution + "P Quality");
    }

    @Override
    public int getBandwidthRequirement() {
        return bandwidth;
    }
}
