package com.demo.rest.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class WelcomeController {

	@RequestMapping("/home")
	public String index(){
		return "index";
	}
}