package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements Engine{
      public void start()
      {
    	  System.out.println("Engine has been Started using Petrol Engine..");
      }
}
