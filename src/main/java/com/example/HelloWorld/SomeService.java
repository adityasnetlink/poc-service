package com.example.HelloWorld;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

public class SomeService {

	

	@Value("${netlink}")
	private String userBucketPath;
	@Scheduled(fixedDelay = 1000)
	public void hello() {
		System.out.println("Hello from scheduler");
		System.out.println(userBucketPath);
		
	}

}