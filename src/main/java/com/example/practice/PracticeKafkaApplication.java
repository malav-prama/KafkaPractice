package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PracticeKafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PracticeKafkaApplication.class, args);
	}

}
