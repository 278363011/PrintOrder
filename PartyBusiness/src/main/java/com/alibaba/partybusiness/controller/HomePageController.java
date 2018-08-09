package com.alibaba.partybusiness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.partybusiness.result.Result;

/**
 * 首页模块
 * @author lenovo
 *
 */
@Controller
public class HomePageController {
	
	
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/")
	String home(){
		System.out.println(state);
		return "Hello World";
	}
	
	public Result<String>  pullOrders
	
}
