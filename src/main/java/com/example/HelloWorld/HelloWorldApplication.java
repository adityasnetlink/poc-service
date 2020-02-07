package com.example.HelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HelloWorld.*;


import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@RestController
@EnableScheduling
@EnableConfigurationProperties(MailProperties.class)
public class HelloWorldApplication
{
	
	
	private   static String userBucketPath;
	
	
	
	
	
	@Value("${netlink}")
	public static void setUserBucketPath(String userBucketPath) {
		HelloWorldApplication.userBucketPath = userBucketPath;
	}



	



	public static void main(String[] args)
	{
		System.out.println("main "+ userBucketPath);
		
		ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("main "+ userBucketPath);
		MailService mailService = context.getBean(MailService.class);
	    mailService.print();
	
		
	}



}
