package com.smart.connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.smart.connect")
public class SmartConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartConnectApplication.class, args);
	}

}
