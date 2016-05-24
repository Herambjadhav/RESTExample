package com.heramb.restexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.heramb.restexample.model.Greeting;
import com.heramb.restexample.service.GreetingService;

@RestController
@RequestMapping("/main")
public class GreetingController {

	@Autowired
	GreetingService greetingService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "Hey everyone!";
	}

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public Greeting displayMessage(@PathVariable String name) {
		return greetingService.greet(name);

	}

}
