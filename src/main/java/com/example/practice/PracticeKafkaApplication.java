package com.example.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class PracticeKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeKafkaApplication.class, args);
	}

}
