package com.victation.study.demo.annotations;


import org.springframework.stereotype.Service;

@Service
public class MyService {


    @CustomAnnotation("Exemplo de valor")
    public void myMethod() {
        System.out.println("Método anotado executado.");
    }
}

