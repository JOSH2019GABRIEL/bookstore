package com.joshcode.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FullBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullBookStoreApplication.class, args);
	}

}
