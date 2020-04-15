package com.example.docker.dockersample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@SpringBootApplication
public class DockerSampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DockerSampleApplication.class, args);
	}

	@GetMapping("/hello")
	public String getHello() {
		return "Hello here";
	}
}
