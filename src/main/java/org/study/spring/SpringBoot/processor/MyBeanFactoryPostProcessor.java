package org.study.spring.SpringBoot.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor在Spring容器初始化后出发,并且只触发一次
 * 触发的时机比BeanPostProcessor早
 * @author glthink
 *
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("============MyBeanFactoryPostProcessor:::"+beanFactory.getBeanDefinitionCount());
	}

}
