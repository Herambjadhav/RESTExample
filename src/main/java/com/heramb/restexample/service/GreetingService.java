package com.heramb.restexample.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.heramb.restexample.model.Greeting;

@Component
public class GreetingService {
	
	public Greeting greet(String name){
		Greeting greeting = new Greeting();
		greeting.setName(name);
		
		LocalDateTime dateTime = LocalDateTime.now();
		int hour = dateTime.getHour();
		
		if(hour < 12)
			greeting.setGreeting("Good Morning");
		else if(hour < 19)
			greeting.setGreeting("Good Afternoon");
		else
			greeting.setGreeting("Good Night");
		
		return greeting;
	}
}
