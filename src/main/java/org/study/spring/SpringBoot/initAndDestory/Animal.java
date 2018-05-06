package org.study.spring.SpringBoot.initAndDestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//方法三   注解@PostConstruct,@PreDestroy
public class Animal implements InitializingBean,DisposableBean{
	
	public Animal() {
		System.out.println("===================Animal构造方法=============");
	}
	/**
	 * @PostConstruct修饰的方法会在构造函数之后，init()方法之前运行
	 */
	@PostConstruct
	public void postConstruct() {
		System.out.println("===============Animal @PostConstruct===========");
	}
	/**
	 * @PreDestroy修饰的方法会在destroy()方法之后运行，在Servlet被彻底卸载之前。
	 */
	@PreDestroy
	public void preDestroy() {
		System.out.println("===============Animal preDestroy===========");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===============Animal afterPropertiesSet===========");		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("===============Animal destroy===========");		
	}
	
	
	
	public void initMethod() {
		System.out.println("===============Animal initMethod===========");
	}
	
	public void destoryMethod() {
		System.out.println("===============Animal destoryMethod===========");
	}
	
}
