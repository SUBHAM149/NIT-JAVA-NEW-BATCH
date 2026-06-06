package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

	@Autowired
	@Qualifier("smsNotification")
	private NotificationService service;

	public void notifyUser(String message) {
		service.sendNotification(message);
	}
}
