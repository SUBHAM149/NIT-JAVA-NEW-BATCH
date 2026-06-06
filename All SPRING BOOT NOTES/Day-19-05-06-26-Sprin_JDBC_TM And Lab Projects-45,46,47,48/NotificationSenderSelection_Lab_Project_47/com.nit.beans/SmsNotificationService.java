package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("smsNotification")
public class SmsNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("SMS Sent : " + message);
	}
}
