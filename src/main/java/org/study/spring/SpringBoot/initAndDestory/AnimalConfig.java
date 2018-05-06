package org.study.spring.SpringBoot.initAndDestory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.study.spring.SpringBoot.application.MyBeanPostProcessor;

@Configuration
public class AnimalConfig {
	@Bean
	public Cat createCat() {
		return new Cat();
	}
	@Bean(initMethod="init", destroyMethod="destory")
	public Dog createDog() {
		return new Dog();
	}
	@Bean(initMethod="initMethod", destroyMethod="destoryMethod")
	public Animal createAnimal() {
		return new Animal();
	}
}
