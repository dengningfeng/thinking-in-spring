package org.thinking.in.spring.ioc.overview.dependency.repository;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.thinking.in.spring.ioc.overview.domain.User;

import java.util.Collection;

/**
 * @program: UserRepository
 * @description: user仓储
 * @author: dengningfeng
 * @cteate: 2021-05-18 17:11
 **/
public class UserRepository {
    private Collection<User> users;

    private BeanFactory beanFactory;

    private ObjectFactory<ApplicationContext> objectFactory;

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public ObjectFactory<ApplicationContext> getObjectFactory() {
        return objectFactory;
    }

    public void setObjectFactory(ObjectFactory<ApplicationContext> objectFactory) {
        this.objectFactory = objectFactory;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                ", beanFactory=" + beanFactory +
                ", objectFactory=" + objectFactory +
                '}';
    }
}
