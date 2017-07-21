package com.star.up;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "com","com.config" })
@SpringBootApplication
@EnableWebMvc
public class SpringBootStart extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStart.class, args);
	}

}
