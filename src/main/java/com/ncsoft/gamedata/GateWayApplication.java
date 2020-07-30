package com.ncsoft.gamedata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);

		/*new SpringApplicationBuilder(com.ncsoft.gamedata.GateWayApplication.class)
				  .properties("spring.config.name=application")
				  .run(args);*/
	}
}
