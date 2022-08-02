package com.handson02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletHandsOn02Application {

	public static void main(String[] args) {
		SpringApplication.run(ServletHandsOn02Application.class, args);
	}

}
