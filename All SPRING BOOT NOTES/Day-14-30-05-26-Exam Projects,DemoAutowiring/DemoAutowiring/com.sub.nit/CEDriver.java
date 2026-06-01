package com.sub.nit;

public class CEDriver {

	public static void main(String[] args) {
		Engine e=new Engine();
		Car c=new Car(e);
		c.drive();
		
	}

}
OUTPUT
------
We are driving car
