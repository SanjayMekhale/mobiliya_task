package com.discoveryserver;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {

	private static final Logger logger = LogManager.getLogger(DiscoveryServerApplication.class);
	
	public static void main(String[] args) {
		logger.info("Application Starting.....");
		SpringApplication.run(DiscoveryServerApplication.class, args);
	}

}

