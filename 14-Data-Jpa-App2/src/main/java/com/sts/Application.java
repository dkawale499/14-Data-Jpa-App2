package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sts.service.TatamService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		TatamService tatamService = context.getBean(TatamService.class);
		tatamService.savedTataMotors();
	}

}
