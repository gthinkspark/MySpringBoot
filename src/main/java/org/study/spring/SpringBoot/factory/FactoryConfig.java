package org.study.spring.SpringBoot.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactoryConfig {
	//工厂模式1
	@Bean
	public JeepFactoryBean createJeepFactoryBean() {
		return new JeepFactoryBean();
	}
	
	//工厂模式2
	@Bean
	public CarFactory createCarFactory() {
		return new CarFactory();
	}
	
	@Bean
	public Car createCar(CarFactory carFactory) {
		return carFactory.createCar();
	}
}
