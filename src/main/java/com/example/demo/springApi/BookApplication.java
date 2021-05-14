package com.example.demo.springApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
//		System.setProperty("server.servlet.context-path", "/czarek");
		SpringApplication.run(BookApplication.class, args);
	}

}
