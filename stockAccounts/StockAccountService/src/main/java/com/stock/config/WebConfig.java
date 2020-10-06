package com.stock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//TODO Declare as a configuration class
//TODO Add the annotation to enable Spring MVC
//TODO Add the annotation to specify auto-scan of com.stock
@Configuration
@EnableWebMvc
@ComponentScan("com.stock")
public class WebConfig {
}
