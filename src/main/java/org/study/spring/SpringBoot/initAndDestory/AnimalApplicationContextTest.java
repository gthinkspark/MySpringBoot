package org.study.spring.SpringBoot.initAndDestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalApplicationContextTest {
	  
	public static void main( String[] args ) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfig.class);
		//装配前和销毁后
    	System.out.println(context.getBean(Cat.class));
    	System.out.println(context.getBean(Dog.class));
    	System.out.println(context.getBean(Animal.class));
    	
    	context.close();
	}
}
