package org.study.spring.SpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
    	//get1 根据类型装配bean
    	Mybean mybean = context.getBean(Mybean.class);
    	System.out.println(mybean);
    	//get2 根据名字装配bean
    	System.out.println(context.getBean("myBean"));
    	
    	

    	
    	context.close();
    }
}
