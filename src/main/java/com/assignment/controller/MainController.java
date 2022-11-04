package com.assignment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/test")
	public String m1()
	{
		return "This is only for spring test";
	}
	@RequestMapping("/test2")
	public String m2()
	{
		return "This is another test for different RESTFull service";
	}

}
