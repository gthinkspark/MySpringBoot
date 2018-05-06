package org.study.spring.SpringBoot.application;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor，针对所有Spring上下文中所有的bean，可以在配置文档applicationContext.xml中配置一个BeanPostProcessor，
 * 然后对所有的bean进行一个初始化之前和之后的代理
 * @author glthink
 *
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{
	@Autowired
	private ApplicationContext applicationContext;
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("========MyBeanPostProcessor  postProcessBeforeInitialization========");
		//模拟ApplicationContextAware 实现原理
		if(bean instanceof ApplicationContextAware) {
			((ApplicationContextAware) bean).setApplicationContext(applicationContext);
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("========MyBeanPostProcessor  postProcessAfterInitialization========");
		return bean;
	}

}
