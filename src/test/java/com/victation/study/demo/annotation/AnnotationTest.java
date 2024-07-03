package com.victation.study.demo.annotation;

import com.victation.study.demo.annotations.MyService;
import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AnnotationTest {

    @Autowired
    MyService myService;

    @Test
    void annotationService() {

        myService.myMethod();
        Assert.assertEquals(true, true);
    }

}
