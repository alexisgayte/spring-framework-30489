package com.example.demoreactiveweb;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public interface HelloControllerInterface {

	@PreAuthorize("hasRole('ROLE_AUTHENTICATED')")
	@GetMapping("/test")
	public String get(@RequestParam String id);

}
