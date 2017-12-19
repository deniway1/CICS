package com.sun.cics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class CicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicsApplication.class, args);
	}
}
