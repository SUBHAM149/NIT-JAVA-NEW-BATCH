package com.nit.beans;

import java.time.LocalDateTime;

public class WishMessage {

    private LocalDateTime currentDateTime;

    // Setter Injection
    public void setCurrentDateTime(LocalDateTime currentDateTime) {
        this.currentDateTime = currentDateTime;
    }

    // Business Method
    public String generateWishMessage() {

        int hour = currentDateTime.getHour();

        if (hour < 12) {
            return "Good Morning";
        }
        else if (hour < 18) {
            return "Good Afternoon";
        }
        else {
            return "Good Evening";
        }
    }
}
