package org.thinking.in.spring.ioc.overview.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @program: SuperUser
 * @description: 超级、特殊的
 * @author: dengningfeng
 * @cteate: 2021-05-18 11:58
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Super {

}
