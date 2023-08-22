package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController1 {
	@GetMapping("disp")
	public String display()
	{
		return "WELCOME";
	}

}
