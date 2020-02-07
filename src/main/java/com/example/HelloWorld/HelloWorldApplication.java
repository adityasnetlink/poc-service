package com.example.HelloWorld;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloWorld.*;


import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@RestController
@EnableScheduling
@Configuration
@ConfigurationProperties(prefix = "jdbc")
public class HelloWorldApplication
{
	
	
	private   static String userBucketPath;
	
	
	
	
	
	@Value("${netlink}")
	public static void setUserBucketPath(String userBucketPath) {
		HelloWorldApplication.userBucketPath = userBucketPath;
	}

	

	 @Autowired
	    private JdbcProperties jdbcProperties;
	 @PostConstruct
	    public void display()
	    {
	        System.out.println("*** Read from Property file ***");
	        System.out.println("Url      : "+jdbcProperties.getUrl());
	        System.out.println("Driver   : "+jdbcProperties.getDriver());
	        System.out.println("Username : "+jdbcProperties.getUsername());
	        System.out.println("Password : "+jdbcProperties.getPassword());
	    }



	public static void main(String[] args)
	{
		System.out.println("main "+ userBucketPath);
		
		 SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("main "+ userBucketPath);
		
	
		
	}



}
