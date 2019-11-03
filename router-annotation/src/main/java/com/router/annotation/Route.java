package com.router.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * User: LuHao
 * Date: 2019/11/3 15:29
 * Describe:路线，寻找模块的注解
 */
@Target(ElementType.TYPE)//作用域
@Retention(RetentionPolicy.CLASS)//存在时间
public @interface Route {
    String path();//路由的路径，标识一个路由的节点
    String group() default "";//将路由节点进行分组，实现按组动态加载
}
