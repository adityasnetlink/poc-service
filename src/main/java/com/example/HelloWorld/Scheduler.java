package com.example.HelloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	  @Autowired
        private ApplicationProperties applicationProperties;

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat(
			"MM/dd/yyyy HH:mm:ss");

	@Scheduled(fixedRate = 100)
	public void performTask() {

		System.out.println("Regular task performed at "
				+ dateFormat.format(new Date()));
				System.out.println("The balance url is " + this.applicationProperties.getGetbalance());
            System.out.println("The transfer url is " + this.applicationProperties.getTransferfund());
            System.out.println("The customerinfo url is " + this.applicationProperties.getCustomerinfo());

	}

	
}
