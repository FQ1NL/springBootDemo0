package com.firstDemo.springBootFD;

import com.firstDemo.springBootFD.apiDemo.HelloWorld;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootFdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFdApplication.class, args);

	}
}
