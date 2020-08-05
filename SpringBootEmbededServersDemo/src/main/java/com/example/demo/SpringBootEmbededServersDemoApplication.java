package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEmbededServersDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmbededServersDemoApplication.class, args);
	}
	
	@RestController
	class MyController{
		
		@GetMapping("/")
		public String hello() {
			return "Hello World!!!";
		}
		
	}

}
