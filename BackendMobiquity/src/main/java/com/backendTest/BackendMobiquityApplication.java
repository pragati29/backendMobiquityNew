package com.backendTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.StaticMessageSource;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BackendMobiquityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendMobiquityApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
