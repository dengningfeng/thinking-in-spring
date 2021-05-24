package org.thinking.in.spring.ioc.overview.domain;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @program: User
 * @description: 用户类
 * @author: dengningfeng
 * @cteate: 2021-05-18 11:34
 **/
public class User {
    private String name;

    private Integer id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
