package org.study.spring.SpringBoot.depend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

//basePackages可指定扫描的包名,excludeFilters指定一个过滤器,
//@Filter 过滤器注解,指定过滤的类型和值,具体参见FilterType
@ComponentScan(basePackages="org.study.spring.SpringBoot.depend",
excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes= {UserService.class,UserController.class}))
@Configuration
public class AnnotationScan {

}
