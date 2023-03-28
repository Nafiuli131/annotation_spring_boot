package com.example.annotation_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnnotationSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("execute this application");
		SpringApplication.run(AnnotationSpringBootApplication.class, args);
	}

}
