package org.thinking.in.spring.bean.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.thinking.in.spring.ioc.overview.domain.User;

/**
 * @program: FactoryBean
 * @description: FactoryBean创建bean
 * @author: dengningfeng
 * @cteate: 2021-05-24 11:33
 **/
public class FactoryBeanCreateBeanDemo implements FactoryBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean(FactoryBeanCreateBeanDemo.class);
        applicationContext.refresh();
        System.out.println(applicationContext.getBeansOfType(User.class));
    }


    @Override
    public Object getObject(){
        User user = new User();
        user.setId(6);
        user.setName("大狗");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
