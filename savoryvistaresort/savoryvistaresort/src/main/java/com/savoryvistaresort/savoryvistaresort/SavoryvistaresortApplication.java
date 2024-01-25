package com.savoryvistaresort.savoryvistaresort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SavoryvistaresortApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavoryvistaresortApplication.class, args);
		System.out.println("hello");

	}
}
