package com.lifeofal.calendar.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class LoaCalendarServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoaCalendarServiceApplication.class, args);
	}

}
