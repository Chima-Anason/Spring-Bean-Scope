package com.seleniumexpress.api;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MyBean {
	
	private String websiteName = "Selenium express";
	
	
	public MyBean() {
		
		System.out.println("MyBean obj created...");
	}

	public String getWebsiteName() {
		return websiteName;
	}

	public void setWebsiteName(String websiteName) {
		this.websiteName = websiteName;
	}

}
