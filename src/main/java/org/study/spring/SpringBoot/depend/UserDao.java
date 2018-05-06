package org.study.spring.SpringBoot.depend;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
//@Repository 一般用在访问数据层上面,即Dao层
@Repository
public class UserDao {
	@Autowired				//Spring提供的注解,默认按类型装配
	@Qualifier("createUser")	//存在多个相同类型的实例,需要指定一个
	private User user;
	
	@Resource				//JSR-250自动装配,默认按name名字装配
	private User createUser;
	
	@Inject					//JSR-330自动装配,默认按name名字装配,注意需要手动添加inject依赖包
	private User myUser;
	
	public void showUser() {
		System.out.println("UserDao Show");
		System.out.println(user);
		System.out.println(createUser);
		System.out.println(myUser);
	}
}
