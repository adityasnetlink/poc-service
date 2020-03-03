package com.PocService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@RefreshScope
@EnableAutoConfiguration
public class SpringCloudKubernetesConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKubernetesConfigExampleApplication.class, args);
	}

}
