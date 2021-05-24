package org.thinking.in.spring.bean.definition;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: BeanAliasDemo
 * @description: bean别名demo
 * @author: dengningfeng
 * @cteate: 2021-05-24 09:41
 **/
public class BeanAliasDemo {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-definitions-context.xml");
        System.out.println(beanFactory.getBean("user-alias"));
    }
}
