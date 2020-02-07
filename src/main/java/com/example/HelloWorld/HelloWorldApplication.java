package com.example.HelloWorld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	 public static String driver;
	    public static String url;
	    public static String username;
	    public static String password;

	    public String getDriver()
	    {
	        return driver;
	    }

	    public void setDriver(String driver)
	    {
	        this.driver = driver;
	    }

	    public String getUrl()
	    {
	        return url;
	    }

	    public void setUrl(String url)
	    {
	        this.url = url;
	    }

	    public String getUsername()
	    {
	        return username;
	    }

	    public void setUsername(String username)
	    {
	        this.username = username;
	    }

	    public String getPassword()
	    {
	        return password;
	    }

	    public void setPassword(String password)
	    {
	        this.password = password;
	    }
		


	



	public static void main(String[] args)
	{
		System.out.println("main "+ userBucketPath);
		System.out.println("driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password);
		 SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("main "+ userBucketPath);
		System.out.println("driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password);
		
	
		
	}



}
