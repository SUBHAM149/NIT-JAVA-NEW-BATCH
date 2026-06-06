package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("emailNotification")
public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Email Sent : " + message);
	}
}
