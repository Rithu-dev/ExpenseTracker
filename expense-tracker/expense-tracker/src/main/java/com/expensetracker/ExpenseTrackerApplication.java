package com.expensetracker;

// Main entry point of spring boot app - this class

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //tells Spring to enable component scanninng, auto-configuration,etc.
public class ExpenseTrackerApplication {

	public static void main(String[] args) {

		// Bootstraps the app and creates the IOC container (ApplicationContext)
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}

}
