package org.thinking.in.spring.bean.definition;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;
import org.thinking.in.spring.ioc.overview.domain.User;

/**
 * @program: AnnotationBeanDefinitionDemo
 * @description: 注解BeanDefinition示例
 * @author: dengningfeng
 * @cteate: 2021-05-24 10:28
 **/
@Import(AnnotationBeanDefinitionDemo.Config.class)//通过@Import导入bean
public class AnnotationBeanDefinitionDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.registerBean(AnnotationBeanDefinitionDemo.class);
        applicationContext.refresh();
        //注册beanDefinition
        registerBean(applicationContext,"userRegister",User.class);
        System.out.println(applicationContext.getBeansOfType(User.class));
    }

    /**
     * 注册beanDefinition
      * @param registry
     * @param beanName
     * @param beanClass
     */
    public static void registerBean(BeanDefinitionRegistry registry,String beanName,Class<?> beanClass){
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(beanClass);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.add("id",2).add("name","旺财");
        genericBeanDefinition.setPropertyValues(propertyValues);
        if (StringUtils.isEmpty(beanName)){
            BeanDefinitionReaderUtils.registerWithGeneratedName(genericBeanDefinition,registry);
        }else {
            registry.registerBeanDefinition(beanName,genericBeanDefinition);
        }
    }

    static class Config{
        /**
         * 通过@Bean导入bean
         * @return
         */
        @Bean(name = {"user","user-alias"})
        public User user(){
            User user = new User();
            user.setId(1);
            user.setName("旺仔");
            return user;
        }
    }
}
