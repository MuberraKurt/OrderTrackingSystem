package com.example.ordertracking;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title= "Order API", version="2.0" ,description= "Order Tracking"))
public class OrdertrackingApplication {

	public static void main(String[] args) {

		SpringApplication.run(OrdertrackingApplication.class, args);
	}

}
