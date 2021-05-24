package org.thinking.in.spring.bean.factory;

import org.thinking.in.spring.ioc.overview.domain.User;

/**
 * @program: StaticFactoryMehod
 * @description: 静态工厂方法创建bean
 * @author: dengningfeng
 * @cteate: 2021-05-24 11:20
 **/
public class StaticFactoryMehod {
    /**
     * 静态工厂创建bean
     * @return
     */
    public static User createBean(){
        User user = new User();
        user.setId(3);
        user.setName("小强");
        return user;
    }
}
