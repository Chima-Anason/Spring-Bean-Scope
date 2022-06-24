package com.seleniumexpress.mvc2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.api.ApplicationScopeTest;
import com.seleniumexpress.api.SingletonTest;

@Controller
@RequestMapping("/app2")
public class Controller2 {
	
	@Autowired
	private ApplicationScopeTest appScopeTest;
	
	@Autowired
	private SingletonTest singletonTest;
	
	
	@ResponseBody
	@RequestMapping("/accessValue")
	public String appTwo() {
		
		return "App Two >>>> " + "ApplicationScopeTest Value " + appScopeTest.getNo()+
				"  SingletonTest value " + singletonTest.getNo();
	}

}
