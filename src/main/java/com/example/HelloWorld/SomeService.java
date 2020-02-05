package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;

public class SomeService {

	@Autowired
	private ApplicationProperties applicationProperties;

	@Value("${netlink}")
	private String userBucketPath;
	@Scheduled(fixedDelay = 1000)
	public void hello() {
		System.out.println(userBucketPath);
		/*
		 * System.out.println("The balance url is " +
		 * this.applicationProperties.getGetbalance());
		 * System.out.println("The transfer url is " +
		 * this.applicationProperties.getTransferfund());
		 * System.out.println("The customerinfo url is " +
		 * this.applicationProperties.getCustomerinfo());
		 */
	}

}