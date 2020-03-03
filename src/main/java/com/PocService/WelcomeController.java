package com.PocService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
@RefreshScope
public class WelcomeController {

    @Value("${message:Welcome to Youtube}")
    private String message;

    @GetMapping
    public String welcome() {
        System.out.println(message);
        return message;
    }
}
