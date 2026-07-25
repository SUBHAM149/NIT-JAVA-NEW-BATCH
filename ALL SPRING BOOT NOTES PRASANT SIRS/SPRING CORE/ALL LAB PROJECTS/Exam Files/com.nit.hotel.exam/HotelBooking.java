package com.nit.hotel.exam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HotelBooking {

    @Value("${guest.name}")
    private String guestName;

    @Value("${room.price}")
    private double roomPrice;

    @Value("${number.of.days}")
    private int numberOfDays;

    @Value("${food.charges}")
    private double foodCharges;

    @Value("${service.tax}")
    private double serviceTaxPercentage;

    public void generateBill() {

        double roomCharges = roomPrice * numberOfDays;
        double subTotal = roomCharges + foodCharges;
        double serviceTax = subTotal * serviceTaxPercentage / 100;
        double finalBill = subTotal + serviceTax;

        System.out.println("========== Hotel Booking Bill ==========");
        System.out.println("Guest Name           : " + guestName);
        System.out.println("Room Price/Day       : " + roomPrice);
        System.out.println("Number of Days       : " + numberOfDays);
        System.out.println("Food Charges         : " + foodCharges);
        System.out.println("Service Tax (%)      : " + serviceTaxPercentage);

        System.out.println("----------------------------------------");

        System.out.println("Room Charges         : " + roomCharges);
        System.out.println("Subtotal             : " + subTotal);
        System.out.println("Service Tax          : " + serviceTax);
        System.out.println("Final Bill           : " + finalBill);
    }
}
