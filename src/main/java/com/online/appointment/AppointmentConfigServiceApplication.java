package com.online.appointment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AppointmentConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentConfigServiceApplication.class, args);
	}

}
