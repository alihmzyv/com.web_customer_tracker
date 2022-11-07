package com.example.web_customer_tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring-mvc-demo.xml")
public class CustomerTrackingAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerTrackingAppApplication.class, args);
	}
}
