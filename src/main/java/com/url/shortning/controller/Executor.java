package com.url.shortning.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.url.shortning"})
public class Executor {

	public static void main(String[] args) {
		SpringApplication.run(Executor.class, args);
	}

}
