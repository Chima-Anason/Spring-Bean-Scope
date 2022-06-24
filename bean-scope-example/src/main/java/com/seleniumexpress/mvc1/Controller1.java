package com.seleniumexpress.mvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seleniumexpress.api.ApplicationScopeTest;
import com.seleniumexpress.api.SingletonTest;

@Controller
@RequestMapping("/app1")
public class Controller1 {
	
	@Autowired
	private ApplicationScopeTest appScopeTest;
	
	@Autowired
	private SingletonTest singletonTest;
	
	
	@ResponseBody
	@RequestMapping("/changeDefaultValue")
	public String test() {
		
		//changing ApplicationScopeTest default Value
		appScopeTest.setNo(5);

		//changing SingletonTest default Value
		singletonTest.setNo(5);
		
		
		return "App One >>>> " + "ApplicationScopeTest Value " + appScopeTest.getNo()+
				"  SingletonTest value " + singletonTest.getNo();
	}

}
