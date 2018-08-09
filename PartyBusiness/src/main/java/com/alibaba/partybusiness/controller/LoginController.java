package com.alibaba.partybusiness.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	@Value("${alibaba.state}")
	public  String state;
	
	@RequestMapping("/")
	String home(){
		System.out.println(state);
		return "Hello World";
	}


}
