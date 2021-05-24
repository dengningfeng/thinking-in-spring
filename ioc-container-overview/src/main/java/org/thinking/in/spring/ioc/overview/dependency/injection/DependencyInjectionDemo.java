package org.thinking.in.spring.ioc.overview.dependency.injection;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinking.in.spring.ioc.overview.dependency.repository.UserRepository;

/**
 * @program: DependencyInjectionDemo
 * @description: 依赖注入demo
 * @author: dengningfeng
 * @cteate: 2021-05-18 17:00
 **/
public class DependencyInjectionDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/dependency-injection-context.xml");
        UserRepository userRepository = (UserRepository) applicationContext.getBean("userRepository");
        System.out.println(userRepository);
        System.out.println(applicationContext==userRepository.getBeanFactory());
        System.out.println(applicationContext.getBeanFactory()==userRepository.getBeanFactory());
        System.out.println(userRepository.getObjectFactory().getObject()==applicationContext);
    }
}
