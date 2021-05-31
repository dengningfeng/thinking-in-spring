package org.thinking.in.spring.bean.definition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinking.in.spring.bean.factory.UserFactory;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpecialBeanInstantiationDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/special-bean-instantiation-context.xml");
        ServiceLoader<UserFactory> serviceLoader = applicationContext.getBean("userFactoryServiceLoader", ServiceLoader.class);
        Iterator<UserFactory> iterator = serviceLoader.iterator();
        while (iterator.hasNext()){
            UserFactory next = iterator.next();
            System.out.println(next.createUser());
        }
    }
}
