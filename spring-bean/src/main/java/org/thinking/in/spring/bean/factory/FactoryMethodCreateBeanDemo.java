package org.thinking.in.spring.bean.factory;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinking.in.spring.ioc.overview.domain.User;

/**
 * @program: FactoryMethodCreateBeanDemo
 * @description: 工厂方法创建bean
 * @author: dengningfeng
 * @cteate: 2021-05-24 11:22
 **/
public class FactoryMethodCreateBeanDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/bean-instantiation-context.xml");
        System.out.println(applicationContext.getBeansOfType(User.class));
    }
}
