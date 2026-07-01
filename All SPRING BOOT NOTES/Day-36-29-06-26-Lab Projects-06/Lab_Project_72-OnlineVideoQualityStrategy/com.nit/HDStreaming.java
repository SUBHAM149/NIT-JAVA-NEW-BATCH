package com.nit;

public class HDStreaming implements StreamingStrategy {

    private int frameRate;
    private int bandwidth;

    public void setFrameRate(int frameRate) {
        this.frameRate = frameRate;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public void streamVideo(String movieName) {
        System.out.println("Streaming " + movieName + " Movie in HD Quality");
    }

    @Override
    public int getBandwidthRequirement() {
        return bandwidth;
    }
}
