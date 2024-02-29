package com.jiyoo.springwebatoz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringWebAtozApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAtozApplication.class, args);
	}

}
