package com.sub.nit.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	   @Value("${you.name:Not Found}")
       private String yourName;
	   
	   @GetMapping("/get-name")
	   public String getName() {
		   return "My Name is:"+yourName;
	   }
       
}
