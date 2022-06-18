package com.seleniumexpress.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		
		System.out.println(obj1 + "  " + obj2);
		
		if(obj1 == obj2) {
			
			System.out.println("same object returned ......");
		}

	}

}