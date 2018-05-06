package org.study.spring.SpringBoot.factory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryApplicationContextTest {
	  
	public static void main( String[] args ) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FactoryConfig.class);
		//工厂模式1
    	//FactoryBean 工厂类    isSingleton() 可控制是否是单例创建模式
    	//获取工厂类代理的 Jeep 类	 
    	System.out.println(context.getBean(Jeep.class));
    	System.out.println(context.getBean("createJeepFactoryBean"));
    	//获取工厂类本身的两种方法
    	System.out.println(context.getBean(JeepFactoryBean.class));
    	System.out.println(context.getBean("&createJeepFactoryBean"));
    	//工厂模式2
    	//因为Spring装配的时候会默认把已经装配的参数装配进去
    	System.out.println(context.getBean(Car.class));
    	System.out.println(context.getBean("createCar"));
    	//获取CarFactory
    	System.out.println(context.getBean(CarFactory.class));
    	
    	context.close();
	}
}
