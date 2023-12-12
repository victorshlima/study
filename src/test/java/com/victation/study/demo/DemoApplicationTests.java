package com.victation.study.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.victation.study.demo.String.StringMethods;
import com.victation.study.demo.DependecyInjection1.service.ServiceGeneric;
import com.victation.study.domain.MyClass;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    ServiceGeneric serviceGeneric;

    @Test
    void stringBufferTest() {
        Assert.assertEquals(StringMethods.stringBufferTest(), "123");
    }

    @Test
    void whenObjectMapper() throws JsonProcessingException {
        String json = "{ \"name\": \"João \",  \"age\": 18 }";

        ObjectMapper objectMapper = new ObjectMapper();
        MyClass myObject = objectMapper.readValue(json, MyClass.class);
        System.out.println(myObject.age);

    }

    @Test
    void whenAutoAndarShoudReturn() {
        serviceGeneric.andarComTodos();
    }

}
