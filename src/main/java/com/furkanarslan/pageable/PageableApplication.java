package com.furkanarslan.pageable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.furkanarslan")
@EntityScan(basePackages = "com.furkanarslan")
@EnableJpaRepositories(basePackages = "com.furkanarslan")
public class PageableApplication {

	public static void main(String[] args) {
		SpringApplication.run(PageableApplication.class, args);
	}

}
