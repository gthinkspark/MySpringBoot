package org.study.spring.SpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean(name="myBean")
	@Scope("prototype")
	public Mybean createMyBean() {
		return new Mybean();
	}
	
	
}
