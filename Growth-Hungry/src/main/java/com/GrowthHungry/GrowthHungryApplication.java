package com.GrowthHungry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GrowthHungryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrowthHungryApplication.class, args);
		// System.out.println("HelloWorld"); // optional
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
