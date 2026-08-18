package com.example.dakiplataformas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DakiPlataformasApplication {

	public static void main(String[] args) {
		SpringApplication.run(DakiPlataformasApplication.class, args);
	}

}
