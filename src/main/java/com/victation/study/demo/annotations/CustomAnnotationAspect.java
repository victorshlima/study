package com.victation.study.demo.annotations;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAnnotationAspect {

    @Before("@annotation(customAnnotation)")
    public void beforeMethod(CustomAnnotation customAnnotation, ApplicationContext applicationContext, Environment environment) {
        // Implementar a lógica que será executada antes do método anotado

        System.out.println(applicationContext.getApplicationName());
        System.out.println(environment.getProperty(""));
        System.out.println("before - Valor da anotação: " + customAnnotation.value());
    }

    @After("@annotation(customAnnotation)")
    public void afterMethod(CustomAnnotation customAnnotation) {
        // Implementar a lógica que será executada antes do método anotado
        System.out.println("after - Valor da anotação: " + customAnnotation.value());
    }
}
