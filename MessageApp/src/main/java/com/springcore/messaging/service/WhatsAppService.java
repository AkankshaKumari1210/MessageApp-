package com.springcore.messaging.service;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class WhatsAppService implements MessageService{

	public void send(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("WhatsApp is sending message: " + msg);
		
	}

}
