package com.example.HelloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");

	
	 @Value("${netlink}")
	 private String userBucketPath;
	
	 
	@Scheduled(fixedRate = 10000)
	public void performTask() {

		System.out.println("Regular task performed at "
				+ dateFormat.format(new Date()));
		System.out.println(userBucketPath);
		

	}

	
}
