package com.seleniumexpress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public abstract class School {
	
	@Autowired
	private Student student;
	
	public School() {
		System.out.println("School obj created.....");
	}
	
	
	@Lookup
	abstract Student createStudentObj();

	public Student getStudent() {
		
		Student student =createStudentObj();
		
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
