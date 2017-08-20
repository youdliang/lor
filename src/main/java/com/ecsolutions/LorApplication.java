package com.ecsolutions;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ecsolutions.dao")
public class LorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LorApplication.class, args);
	}
}
