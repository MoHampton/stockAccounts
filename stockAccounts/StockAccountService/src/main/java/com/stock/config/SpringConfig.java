package com.stock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


//TODO Declare as a Spring configuration class
//TODO Import SpringRepositoryConfig and SpringServicesConfig classes
@Configuration
@Import( {SpringRepositoryConfig.class, SpringServicesConfig.class} )
public class SpringConfig {}