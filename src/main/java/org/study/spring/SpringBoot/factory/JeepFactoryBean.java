package org.study.spring.SpringBoot.factory;

import org.springframework.beans.factory.FactoryBean;

public class JeepFactoryBean implements FactoryBean<Jeep>{

	@Override
	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	@Override
	public Class<?> getObjectType() {
		return Jeep.class;
	}
	
	/***
	 * 可控制是否是单例模式
	 */
	@Override
	public boolean isSingleton() {
		return false;
	}

}
