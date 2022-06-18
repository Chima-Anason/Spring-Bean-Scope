package com.seleniumexpress.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//For Prototype
		PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
		PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
		
		System.out.println(obj1 + "  " + obj2);
		
		if (obj1 == obj2) {

			System.out.println("same object returned ......");
		}else {
			
			System.out.println("different object returned ......");
		}
		
		
	   //For Singleton
/*      SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		
		System.out.println(obj1 + "  " + obj2);
		
		if(obj1 == obj2) {
			
			System.out.println("same object returned ......");
		}
*/
		
		
	}


}
