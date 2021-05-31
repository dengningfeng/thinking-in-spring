package org.thinking.in.spring.bean.factory;

import org.thinking.in.spring.ioc.overview.domain.User;

/**
 * @program: InstantiationFactoryMehod
 * @description: 实例化工厂方法
 * @author: dengningfeng
 * @cteate: 2021-05-24 11:30
 **/
public class InstantiationFactoryMehod implements UserFactory{
    public User createUser(){
        User user = new User();
        user.setId(5);
        user.setName("大黄");
        return user;
    }
}
