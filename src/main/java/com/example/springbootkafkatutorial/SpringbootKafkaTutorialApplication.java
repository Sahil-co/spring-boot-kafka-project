package com.example.springbootkafkatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.springbootkafkatutorial.*"})
public class SpringbootKafkaTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaTutorialApplication.class, args);
	}

}
