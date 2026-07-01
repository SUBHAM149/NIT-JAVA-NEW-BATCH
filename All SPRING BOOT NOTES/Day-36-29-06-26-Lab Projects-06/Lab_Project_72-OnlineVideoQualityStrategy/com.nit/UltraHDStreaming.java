package com.nit;
public class UltraHDStreaming implements StreamingStrategy {

    private boolean dolbySupport;
    private int bandwidth;

    public void setDolbySupport(boolean dolbySupport) {
        this.dolbySupport = dolbySupport;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    @Override
    public void streamVideo(String movieName) {

        if (dolbySupport) {
            System.out.println("Streaming " + movieName + " Movie in 4K Dolby Vision");
        } else {
            System.out.println("Streaming " + movieName + " Movie in 4K");
        }
    }

    @Override
    public int getBandwidthRequirement() {
        return bandwidth;
    }

}
