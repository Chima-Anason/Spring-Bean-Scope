package com.seleniumexpress.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.api.MyBean;

@Controller
public class TestController {
	
	@Autowired
	MyBean myBean;
	
	@RequestMapping("/testing1")
	public void test(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("Old website name "+myBean.getWebsiteName()+"</br>");
		myBean.setWebsiteName("Selenium Express updated");
		response.getWriter().write("Update website name "+myBean.getWebsiteName()+"</br>");
		
	}
	
	
	@RequestMapping("/testing2")
	public void test1(HttpServletResponse response) throws IOException {
		
		response.getWriter().write("website name is "+myBean.getWebsiteName()+"</br>");
		
	}

}
