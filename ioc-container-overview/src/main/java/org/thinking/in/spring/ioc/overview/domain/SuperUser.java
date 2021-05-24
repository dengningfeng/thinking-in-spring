package org.thinking.in.spring.ioc.overview.domain;


import org.thinking.in.spring.ioc.overview.annotations.Super;

/**
 * @program: SuperUser
 * @description: 超级用户
 * @author: dengningfeng
 * @cteate: 2021-05-18 11:58
 **/
@Super
public class SuperUser extends User{
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                '}'+super.toString();
    }
}
