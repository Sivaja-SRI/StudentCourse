package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {
	
	
	@RequestMapping("/hello")
	public String HelloMsg() {
		return "Hello SpringBoot!";
	}
}
