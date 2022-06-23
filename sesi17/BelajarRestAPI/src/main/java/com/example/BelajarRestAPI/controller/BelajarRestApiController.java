package com.example.BelajarRestAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/belajar-api/v1")
public class BelajarRestApiController {
	
	@GetMapping(value = "/get")
	public String belajarApi() {
		return "Yuk Kita Belajar API Java Spring Boot";
	}

}
