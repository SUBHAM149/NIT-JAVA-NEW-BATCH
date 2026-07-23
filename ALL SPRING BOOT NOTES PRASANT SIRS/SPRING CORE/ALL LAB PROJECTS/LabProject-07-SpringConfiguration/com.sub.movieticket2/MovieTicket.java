package com.sub.movieticket2;
import org.springframework.stereotype.Component;

@Component
public class MovieTicket {

    private PaymentGateway paymentGateway;

    public MovieTicket(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void bookTicket() {
        System.out.println("Movie Ticket Booked");
        paymentGateway.makePayment();
    }
}
