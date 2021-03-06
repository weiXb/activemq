package com.example.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
public class ActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqApplication.class, args);
	}
}
