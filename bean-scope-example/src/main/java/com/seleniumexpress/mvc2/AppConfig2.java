package com.seleniumexpress.mvc2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.seleniumexpress.api", "com.seleniumexpress.mvc2"})
public class AppConfig2 implements WebMvcConfigurer{

}
