package com.example.HelloWorld;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain {
	@Value("${netlink}")
	private static String userBucketPath;

	public static void main(String[] args) {
		System.out.println("Hello from main");
		System.out.println(userBucketPath);
		SpringApplication.run(AppMain.class, args);
	}

}
