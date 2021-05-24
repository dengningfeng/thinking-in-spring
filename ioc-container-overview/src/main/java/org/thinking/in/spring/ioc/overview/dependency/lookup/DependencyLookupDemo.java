package org.thinking.in.spring.ioc.overview.dependency.lookup;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.thinking.in.spring.ioc.overview.annotations.Super;
import org.thinking.in.spring.ioc.overview.domain.User;

import java.util.Map;

/**
 * 1、通过名称查找
 * 2、通过类型查找
 * 3、根据注解查找
 * @program: DependencyLookupDemo
 * @description: 依赖查找
 * @author: dengningfeng
 * @cteate: 2021-05-18 11:35
 **/
public class DependencyLookupDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/dependency-lookup-context.xml");
        //按照类型查找集合对象
        lookupCollectionByType(applicationContext);
        //按照注解查找集合对象
        lookupCollectionByAnnotation(applicationContext);
        /*//按照类型查找bean
        lookupByType(applicationContext);
        //lookupInRealTime
        lookupInRealTime(applicationContext);
        //通过名称延时查找bean
        lookupInLazy(applicationContext);*/
    }

    /**
     * 根据注解查找集合对象
     * @param beanFactory
     */
    private static void lookupCollectionByAnnotation(BeanFactory beanFactory) {
        ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
        Map<String, User> superUsers = (Map)listableBeanFactory.getBeansWithAnnotation(Super.class);
        System.out.println("查找标注@Super所有的User对象"+superUsers);
    }

    /**
     * 根据类型查找集合对象
     * @param beanFactory
     */
    private static void lookupCollectionByType(BeanFactory beanFactory){
        ListableBeanFactory listableBeanFactory= (ListableBeanFactory) beanFactory;
        Map<String, User> users = listableBeanFactory.getBeansOfType(User.class);
        System.out.println("查找到的user集合对象："+users);
    }
    /**
     * 按照类型查找bean
     * @param beanFactory
     */
    private static void lookupByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println(user);
    }

    /**
     * 通过名称延时查找bean
     * @param beanFactory
     */
    private static void lookupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println(user);
    }

    /**
     * 按照名称实时查找
     * @param beanFactory
     */
    private static void lookupInRealTime(BeanFactory beanFactory) {
        User user = (User) beanFactory.getBean("user");
        System.out.println(user);
    }
}
