package com.example.demoreactiveweb;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stephane Nicoll
 */
@WebFluxTest
class HelloControllerTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	void testUriWithRelaxedChars() {
		String id = "{64aaa32-3f4e-93b0-9cd9-986a0a34a650}";
		webClient.get().uri("/test?id={id}", id).exchange()
				.expectBody(String.class).isEqualTo(id);
	}

}
