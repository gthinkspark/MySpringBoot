package org.study.spring.SpringBoot.depend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApplicationContextTest {
	public static void main(String[] args) {
		//方法一,可以传入一个或者多个注解类文件,扫描一个或多个文件
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class,User.class,UserDao.class,UserService.class,UserController.class);
		//方法二,可传入包名,扫描包下面的所有文件
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.study.spring.SpringBoot.depend");
		//方法三,可传一个注解文件,但注解文件里面拥有@ComponentScan注解可指定扫描规则
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
//		context.getBean(User.class);	//因为同时存在两个Bean所以不知道装配哪个
		System.out.println(context.getBean("myUser"));		//根据名字进行装配
		System.out.println(context.getBeansOfType(User.class));	//获取出所有的User的Bean的集合Map List<Map<String,User>>
		System.out.println(context.getBean(UserDao.class));
//		System.out.println(context.getBean(UserService.class));
//		System.out.println(context.getBean(UserController.class));
		UserDao userDao = context.getBean("userDao", UserDao.class);
		userDao.showUser();
		
		context.close();
	}
}
