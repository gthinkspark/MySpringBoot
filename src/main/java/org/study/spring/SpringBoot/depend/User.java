package org.study.spring.SpringBoot.depend;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Component通用注解,可用于任何Bean,一般没有明确角色的时候使用
@Component("myUser")
@Primary
public class User {

}
