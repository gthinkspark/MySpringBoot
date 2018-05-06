package org.study.spring.SpringBoot.initAndDestory;

//方法二  @Bean(initMethod="init", destroyMethod="destory")
public class Dog {
	
	public void init() {
		System.out.println("===============dog init===========");
	}
	
	public void destory() {
		System.out.println("===============dog destory===========");
	}
}
