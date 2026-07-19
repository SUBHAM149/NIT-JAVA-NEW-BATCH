package com.nit.exam7;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface FlightInfo {

    String airline();
    String flightType();
    String terminal();
    int baggageLimit();

}
