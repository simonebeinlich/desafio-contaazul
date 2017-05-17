package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class SelecaoContaAzulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelecaoContaAzulApplication.class, args);
	}
}
