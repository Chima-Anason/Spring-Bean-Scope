package com.seleniumexpress.api;

import org.springframework.stereotype.Component;

@Component
public class SingletonTest {
	
	private int no = 0;

	public SingletonTest() {
		System.out.println("SingletonTest constr....");
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

}
