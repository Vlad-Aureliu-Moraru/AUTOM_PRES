package com.example.autom_pres;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomPresApplication {

	public static void main(String[] args) {
		System.out.println( "Hello World!");
		SpringApplication.run(AutomPresApplication.class, args);
	}

}
