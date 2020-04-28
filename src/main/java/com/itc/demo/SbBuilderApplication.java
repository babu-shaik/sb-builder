package com.itc.demo;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SbBuilderApplication {

	public static void main(String[] args) {
		
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(SbBuilderApplication.class);
//		builder.bannerMode(Mode.OFF);
//		
//		SpringApplication application = builder.build();
//		application.run(args);
		
		
		SpringApplication.run(SbBuilderApplication.class, args);
	}

}
