package com.seleniumexpress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class School {
	
	@Autowired
	private Student student;
	
	public School() {
		System.out.println("School obj created.....");
	}

}
