package com.victation.study.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

import java.util.TimeZone;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		System.setProperty("user.timezone", "America/Sao_Paulo");
		SpringApplication.from(DemoApplication::main).with(TestDemoApplication.class).run(args);

	}

}
