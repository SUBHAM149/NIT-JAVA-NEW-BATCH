package com.nit.beans;

public class Car {
        private String c_name;
        private String c_model;
        private double c_price;
        private String c_color;
        
        
       private Engine engine;


	   public Car(String c_name, String c_model, double c_price, String c_color, Engine engine) {
		super();
		this.c_name = c_name;
		this.c_model = c_model;
		this.c_price = c_price;
		this.c_color = c_color;
		this.engine = engine;
	   }


	   @Override
	   public String toString() {
		return "Car [c_name=" + c_name + ", c_model=" + c_model + ", c_price=" + c_price + ", c_color=" + c_color
				+ ", engine=" + engine + "]";
	   }
       
       
       public void display()
       {
    	   System.out.println("Car Name: "+c_name);
    	   System.out.println("Car Model: "+c_model);
    	   System.out.println("Car Price: "+c_price);
    	   System.out.println("Car Color: "+c_color);
    	   System.out.println("Engine is: "+engine);
       }
       
       
        
}
