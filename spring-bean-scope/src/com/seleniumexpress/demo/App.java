package com.seleniumexpress.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Scope bean injection problem
		School schoolObj1 = context.getBean("school", School.class);
		
		System.out.println(schoolObj1.getStudent());
		System.out.println(schoolObj1.getStudent());
		
		
		//Singleton Vs Prototype
		/*
		 * Student student1 = context.getBean("student", Student.class);
		 * student1.setName("James"); System.out.println("Student 1 name is " +
		 * student1.getName());
		 * 
		 * Student student2 = context.getBean("student", Student.class);
		 * System.out.println("Student 2 name is " + student2.getName());
		 */
		
		
		//For Prototype
		/*
		 * PrototypeDemo obj1 = context.getBean("prototypeDemo", PrototypeDemo.class);
		 * PrototypeDemo obj2 = context.getBean("prototypeDemo", PrototypeDemo.class);
		 * 
		 * System.out.println(obj1 + "  " + obj2);
		 * 
		 * if (obj1 == obj2) {
		 * 
		 * System.out.println("same object returned ......"); 
		 * }else {
		 * 
		 * System.out.println("different object returned ......");
		 *  }
		 */
		
		
	   //For Singleton
		/*
		 * SingletonDemo obj1 = context.getBean("singletonDemo", SingletonDemo.class);
		 * SingletonDemo obj2 = context.getBean("singletonDemo", SingletonDemo.class);
		 * 
		 * System.out.println(obj1 + "  " + obj2);
		 * 
		 * if(obj1 == obj2) {
		 * 
		 * System.out.println("same object returned ......"); 
		 * }
		 */

		
		
	}


}
