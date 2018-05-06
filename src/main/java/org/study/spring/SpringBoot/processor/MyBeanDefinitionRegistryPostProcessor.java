package org.study.spring.SpringBoot.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor可以拿到ConfigurableListableBeanFactory，BeanDefinitionRegistry两个对象
 * BeanDefinitionRegistry可以动态注入Bean
 * @author glthink
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		//自定义动态注入10个Person的对象
		for(int i=1;i<=10;i++) {
			BeanDefinitionBuilder beanDefinitionBuilder =  BeanDefinitionBuilder.rootBeanDefinition(Person.class);
			beanDefinitionBuilder.addPropertyValue("name", "root"+i);
			registry.registerBeanDefinition("person"+i, beanDefinitionBuilder.getBeanDefinition());
		}
	}

}
