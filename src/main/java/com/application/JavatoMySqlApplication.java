package com.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavatoMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavatoMySqlApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		
		return runner ->{
			System.out.println("Hello World");
		};
		
	}

}
