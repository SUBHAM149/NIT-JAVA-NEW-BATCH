package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

	@Autowired
	@Qualifier("whatsAppService")
	private MessageService messageService;

	public void notifyUser(String msg) {
		messageService.send(msg);
	}
}
