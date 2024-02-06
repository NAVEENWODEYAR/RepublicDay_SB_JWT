package com.rest.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbJwtApplication.class, args);
		System.out.println(Thread.currentThread().getName());
	}
}
