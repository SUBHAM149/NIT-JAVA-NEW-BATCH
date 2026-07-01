package com.nit;
public class VideoPlayer {

    private StreamingStrategy strategy;
    private String userName;

    public void setStrategy(StreamingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void playVideo(String movieName) {

        System.out.println("User : " + userName);

        strategy.streamVideo(movieName);

    }

    public void displayStreamingInfo() {

        System.out.println("Required Bandwidth : "
                + strategy.getBandwidthRequirement() + " Mbps");

    }

}
