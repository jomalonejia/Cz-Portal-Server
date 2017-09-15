package com.cz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class Trace2Application {

	private final Logger logger = LoggerFactory.getLogger(getClass());



	@GetMapping(value = "/trace-2")
	public String trace(){
		logger.info("===<call trace-2>===");
		return "Trace";
	}

	public static void main(String[] args) {
		SpringApplication.run(Trace2Application.class, args);
	}
}
