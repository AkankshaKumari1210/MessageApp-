package com.springcore.messaging.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.messaging.service");
		MessageController messageController = (MessageController) context.getBean("messageController");
		messageController.sendMessage("Hello everyone");

	}

}
