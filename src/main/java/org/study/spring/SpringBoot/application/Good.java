package org.study.spring.SpringBoot.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
/**
 * Spring4.3新特性
 * 注意：
 * 1：构造函数只能有一个,如果有多个的话,就必须要有一个无参的构造函数,此时,Spring回调用无参构造函数
 * 2：构造函数的参数,必须都要在Spring容器中有
 * @author glthink
 *
 */
@Component
public class Good {
	private ApplicationContext applicationContext;
	
	public Good(ApplicationContext applicationContext,@Qualifier("myBank")Bank bank) {
		this.applicationContext = applicationContext;
	}
	
	public void show() {
		System.out.println("Good ApplicationContext::"+applicationContext);
	}
}
