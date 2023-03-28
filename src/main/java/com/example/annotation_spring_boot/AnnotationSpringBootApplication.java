package com.example.annotation_spring_boot;

import com.example.annotation_spring_boot.LazyEager.Eager;
import com.example.annotation_spring_boot.LazyEager.LazyLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
public class AnnotationSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("execute this application");
		var context = SpringApplication.run(AnnotationSpringBootApplication.class, args);
	}

}
