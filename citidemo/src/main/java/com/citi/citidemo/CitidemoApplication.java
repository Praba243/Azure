package com.citi.citidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.citi.citidemo.repository")
public class CitidemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitidemoApplication.class, args);
	}

}
