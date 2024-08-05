package com.example.chickenEggs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.chickenEggs" }, exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class ChickenEggsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChickenEggsApplication.class, args);
	}

}
