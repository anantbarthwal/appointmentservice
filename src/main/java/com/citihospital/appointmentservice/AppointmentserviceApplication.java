package com.citihospital.appointmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.citihospital")
public class AppointmentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentserviceApplication.class, args);
	}

}
