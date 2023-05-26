package com.company.CompanyDetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
public class CompanyDetailApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyDetailApplication.class, args);
	}
	
	@Bean
	public ModelAndView getmodelAndview() {
		return new ModelAndView();
	}

}
