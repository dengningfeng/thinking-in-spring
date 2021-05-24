package org.thinking.in.spring.ioc.overview.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.thinking.in.spring.ioc.overview.domain.User;

import java.util.Map;

/**
 * @program: BeanFactoryAsIocContainerDemo
 * @description: {@link BeanFactory} 作为Ioc容器示例
 * @author: dengningfeng
 * @cteate: 2021-05-19 13:54
 **/
public class BeanFactoryAsIocContainerDemo {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        String location="classpath:META-INF/dependency-lookup-context.xml";
        int beanDefinitionCount = reader.loadBeanDefinitions(location);
        System.out.println("Bean定义加载的数量："+beanDefinitionCount);
        //通过类型依赖查找所有user的Bean
        lookupCollectionByType(beanFactory);
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
}
