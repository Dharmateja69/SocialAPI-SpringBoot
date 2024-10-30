package com.klu.SocailAPISpringweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.klu.controller")
@ComponentScan("com.klu.service")
public class SocailApiSpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocailApiSpringwebApplication.class, args);
		System.out.println("this is working fine !!");
	}

}
