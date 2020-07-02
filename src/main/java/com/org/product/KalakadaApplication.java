package com.org.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableMongoRepositories
public class KalakadaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalakadaApplication.class, args);
	}

}
