package com.nit.beans;

import org.springframework.stereotype.Service;

@Service("pushNotification")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Push Notification Sent : " + message);
	}
}
