package com.di.setter.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigFile.class);
		House house = context.getBean("house", House.class);
		System.out.println(house);
	}
}
