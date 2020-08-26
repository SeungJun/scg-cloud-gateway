package com.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);


//		new SpringApplicationBuilder(GateWayApplication.class)
//				  .properties("spring.config.name=application.yml")
//				  .run(args);
	}
}
