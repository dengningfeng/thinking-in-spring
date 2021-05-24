package org.thinking.in.spring.ioc.overview.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thinking.in.spring.ioc.overview.domain.User;

import java.util.Map;

/**
 * @program: AnnotationApplicationContextAsIocContainerDemo
 * @description: {@link AnnotationConfigApplicationContext} 注解容器作为Ioc容器示例
 * @author: dengningfeng
 * @cteate: 2021-05-19 14:05
 **/
public class AnnotationApplicationContextAsIocContainerDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean(AnnotationApplicationContextAsIocContainerDemo.class);
        //启动应用上下文包括bean扫描、注册监听、初始化环境变量
        applicationContext.refresh();
        //通过类型依赖查找所有user的Bean
        lookupCollectionByType(applicationContext);
    }

    /**
     * 通过类型依赖查找所有user的Bean
     * @param beanFactory
     */
    private static void lookupCollectionByType(BeanFactory beanFactory) {
        ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
        Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
        System.out.println("查找到的所有userbean："+users);
    }

    @Bean
    public User user(){
        User user = new User();
        user.setId(1);
        user.setName("小雷");
        return user;
    }
}
