package org.study.spring.SpringBoot.depend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean
	public User createUser() {
		return new User();
	}
}
