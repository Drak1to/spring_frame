package com.example;

import Service.impl.MagazineServiceImpl;
import domain.Magazine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		MagazineServiceImpl magazineServiceImpl = context.getBean(MagazineServiceImpl.class);

		Magazine magazine = Magazine.builder()
				.tittle("tittle")
				.description("description")
				.price(18.99)
				.build();

		magazineServiceImpl.save(magazine);

		Magazine magazine2 = Magazine.builder()
				.tittle("tittle2")
				.description("description")
				.price(16.99)
				.build();

		Magazine magazine3 = Magazine.builder()
				.tittle("tittle3")
				.description("description")
				.price(17.99)
				.build();

		magazineServiceImpl.save(magazine2);
		magazineServiceImpl.save(magazine3);

	}
	}



