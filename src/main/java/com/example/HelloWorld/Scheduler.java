package com.example.HelloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.HelloWorld.*;
@Configuration
@ConfigurationProperties(prefix = "jdbc")
@Component
public class Scheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");

	
	 @Value("${netlink}")
	 private String userBucketPath;
	 
	 
	 
	 private   static String userBucketPath1;
		
	 
	 public String driver;
	    public String url;
	    public String username;
	    public String password;

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
		
		
		
		
		@Value("${netlink}")
		public static void setUserBucketPath(String userBucketPath1) {
			Scheduler.userBucketPath1 = userBucketPath1;
		}
		
	
	@Scheduled(fixedRate = 10000)
	public void performTask() {

		System.out.println("Regular task performed at "
				+ dateFormat.format(new Date()));
		System.out.println(userBucketPath);
		System.out.println(userBucketPath1);
		System.out.println("driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password);
		 
		
		

	}

	
}
