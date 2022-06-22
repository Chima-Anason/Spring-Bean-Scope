package com.seleniumexpress.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

import com.seleniumexpress.api.MyBean;

@Controller
public class TestController {
	
	@Autowired
	WebApplicationContext context;
	
	@RequestMapping("/testing1")
	public void test(HttpServletResponse response) throws IOException {
		
		
		MyBean myBean1 = context.getBean("myBean", MyBean.class);
		MyBean myBean2 = context.getBean("myBean", MyBean.class);
		
		System.out.println(myBean1 + " " + myBean2);
		
		
	}
	
	
	

}
