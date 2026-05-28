package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class PaymentService {

	
	@Value("10")
	int quantity;
	@Value("250")
	double price;
	
	public void total_price()
	{
	   double total_price=quantity*price;
	   System.out.println("Total Price is:"+total_price);
	   
	}
	
	
	
}
