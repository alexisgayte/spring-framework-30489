package com.example.demoreactiveweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/test")
	public String get(@RequestParam String id) {
		System.out.println(id);
		return id;
	}

}
