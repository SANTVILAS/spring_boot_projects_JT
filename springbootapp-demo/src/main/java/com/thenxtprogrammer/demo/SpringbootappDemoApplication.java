package com.thenxtprogrammer.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.thenxtprogrammer.repository" })
@ComponentScan(basePackages = { "com.thenxtprogrammer.domain" })
public class SpringbootappDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappDemoApplication.class, args);

	}

}

//@EnableAutoConfiguration
//@Configuration
//@ComponentScan(basePackh="com.thenextprogrammer")
//   ->basepackage
//
//FailureAnalyzer->
//Stopwatch===
