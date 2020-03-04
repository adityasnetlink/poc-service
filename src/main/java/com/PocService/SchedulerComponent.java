package com.PocService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component

public class SchedulerComponent {

	
	  @Autowired WelcomeConfiguration config;
	 

    @Value("${content}")
    private String data;
    @Scheduled(fixedDelay = 20000)
    public void schedule() {
    	
    	
        System.out.println(config.getMessage());
        System.out.println(data);
    }
}
