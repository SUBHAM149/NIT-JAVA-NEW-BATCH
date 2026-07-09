package com.sub.deliverypartner;

public class DeliveryPartner {

    private String partnerId;
    private String partnerName;
    private String vehicleType;

    // Default Constructor
    public DeliveryPartner() {
        System.out.println("DeliveryPartner Object Created");
    }

    // Parameterized Constructor
    public DeliveryPartner(String partnerId, String partnerName, String vehicleType) {
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.vehicleType = vehicleType;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "\nPartner Id     : " + partnerId +
               "\nPartner Name   : " + partnerName +
               "\nVehicle Type   : " + vehicleType;
    }
}
