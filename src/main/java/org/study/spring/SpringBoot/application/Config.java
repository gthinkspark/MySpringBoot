package org.study.spring.SpringBoot.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Bank createBank() {
		return new Bank();
	}
}
