package com.example.HelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@RestController
@EnableScheduling

public class HelloWorldApplication
{
	
	@Value("${netlink}")
	private   static String userBucketPath;
	@Value("${netlink1}")
	private   static String userBucketPath1;
	public static void main(String[] args)
	{
		System.out.println("main "+ userBucketPath);
		System.out.println("main "+ userBucketPath1);
		SpringApplication.run(HelloWorldApplication.class, args);
		
	}

//	/*
//	 * @RequestMapping(value = "/hello") public String helloWorld() {
//	 * logger.info("Inside hello method---"); return "Hello World , Aditya "; }
//	 */

}
