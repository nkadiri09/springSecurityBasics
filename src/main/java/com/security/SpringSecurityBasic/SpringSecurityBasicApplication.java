package com.security.SpringSecurityBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.security.controller", "com.security.config"})
public class SpringSecurityBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicApplication.class, args);
	}
}
