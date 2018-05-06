package org.study.spring.SpringBoot.processor;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PostProcessorApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.study.spring.SpringBoot.processor");
		//applicationContext也可以动态注解Bean
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
		builder.addPropertyValue("name", "context root11");
		context.registerBeanDefinition("person11", builder.getBeanDefinition());
		
		//获取context中注入的所有Person
		System.out.println(context.getBeansOfType(Person.class));
		
		context.close();
	}

}
