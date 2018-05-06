package org.study.spring.SpringBoot.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("myBank")
//@Primary
public class Bank {
	@Autowired
	private ApplicationContext applicationContext;
	
	public void show() {
		System.out.println("Bank Application::"+applicationContext);
	}
}
