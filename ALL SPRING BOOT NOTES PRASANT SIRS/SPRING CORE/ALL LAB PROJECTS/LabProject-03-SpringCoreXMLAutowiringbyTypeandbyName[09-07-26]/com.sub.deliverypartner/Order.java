package com.sub.deliverypartner;

public class Order {

    private int orderId;
    private String customerName;
    private String foodItem;

    // Property name must match bean id
    private DeliveryPartner deliveryPartner;

    // Default Constructor
    public Order() {
        System.out.println("Order Object Created");
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }

    public void displayOrderDetails() {

        System.out.println("Order Id          : " + orderId);
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Food Item         : " + foodItem);

        System.out.println("\nDelivery Partner");
        System.out.println(deliveryPartner);
    }
}
