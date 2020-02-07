package com.example.HelloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.HelloWorld.*;

@Component
public class Scheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");

	
	 @Value("${netlink}")
	 private String userBucketPath;
	 
	 
	 
	 private   static String userBucketPath1;
		
	
		
		
		
		
		@Value("${netlink}")
		public static void setUserBucketPath(String userBucketPath1) {
			Scheduler.userBucketPath1 = userBucketPath1;
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
	@Scheduled(fixedRate = 10000)
	public void performTask() {

		System.out.println("Regular task performed at "
				+ dateFormat.format(new Date()));
		System.out.println(userBucketPath);
		System.out.println(userBucketPath1);
		display();
		 
		
		

	}

	
}
