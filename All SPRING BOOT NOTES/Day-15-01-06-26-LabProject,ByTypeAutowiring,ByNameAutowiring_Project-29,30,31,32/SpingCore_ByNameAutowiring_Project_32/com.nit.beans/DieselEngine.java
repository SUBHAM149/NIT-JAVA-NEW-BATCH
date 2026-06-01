package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("dieselEngines")
public class DieselEngine {
	public void start()
    {
  	  System.out.println("Engine has been Started using Diesel Engine..");
    }
}
