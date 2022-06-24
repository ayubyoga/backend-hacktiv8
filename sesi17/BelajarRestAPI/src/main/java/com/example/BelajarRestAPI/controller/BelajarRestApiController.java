package com.example.belajarrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BelajarRestApiController {
	
	@GetMapping("/get")
	public String belajarApi() {
		return "Yuk Kita Belajar API Java Spring Boot";
	}

}
