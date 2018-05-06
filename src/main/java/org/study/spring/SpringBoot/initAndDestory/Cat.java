package org.study.spring.SpringBoot.initAndDestory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//方法一  实现InitializingBean,DisposableBean
public class Cat implements InitializingBean,DisposableBean{
	/**
	 * 装配后执行的方法
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("===========Cat afterPropertiesSet===========");
	}
	
	/**
	 * 销毁前执行的方法
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("===========Cat destroy===========");
	}

}
