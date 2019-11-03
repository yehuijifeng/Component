package com.router.compiler.processor;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * User: LuHao
 * Date: 2019/11/3 15:47
 * Describe:注解处理器，继承原生注解处理器
 */
@AutoService(Process.class)
//更改使用的Java版本
//@SupportedSourceVersion(SourceVersion.RELEASE_8)
//更改注册给哪些注解的标识
//@SupportedAnnotationTypes({"class","method"})
class RouteProcessor extends AbstractProcessor {
    //初始化
    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
    }

    //指定使用的java版本
    @Override
    public SourceVersion getSupportedSourceVersion() {
        //使用你系统当前jdk的版本
        return SourceVersion.latestSupported();
    }

    //指定注解类型
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return super.getSupportedAnnotationTypes();
    }

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {

        return false;
    }
}
