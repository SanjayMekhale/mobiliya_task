package com.match;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MatchServiceApplication {
	private static final Logger logger = LogManager.getLogger(MatchServiceApplication.class);

	public static void main(String[] args) {
		logger.info("Main method started");
		SpringApplication.run(MatchServiceApplication.class, args);
	}

}
