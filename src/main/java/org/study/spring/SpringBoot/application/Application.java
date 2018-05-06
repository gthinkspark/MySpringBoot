package org.study.spring.SpringBoot.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.study.spring.SpringBoot.application");
		System.out.println(context.getBeansOfType(Bank.class));
//		context.getBean(Bank.class).show();;
		context.getBean(Book.class).show();
		context.getBean(Good.class).show();
		
		context.close();
	}

}
