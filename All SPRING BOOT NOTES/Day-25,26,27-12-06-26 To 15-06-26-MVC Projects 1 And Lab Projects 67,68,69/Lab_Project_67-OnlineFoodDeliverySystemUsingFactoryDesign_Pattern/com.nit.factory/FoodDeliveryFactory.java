package com.nit.factory;
import com.nit.service.*;

public class FoodDeliveryFactory {

    public FoodDeliveryService getDeliveryService(String serviceType) {

        if(serviceType.equalsIgnoreCase("SWIGGY")) {
            return new SwiggyDelivery();
        }
        else if(serviceType.equalsIgnoreCase("ZOMATO")) {
            return new ZomatoDelivery();
        }
        else if(serviceType .equalsIgnoreCase("UBEREATS")) {
            return new UberEatsDelivery();
        }

        return null;
    }
}
