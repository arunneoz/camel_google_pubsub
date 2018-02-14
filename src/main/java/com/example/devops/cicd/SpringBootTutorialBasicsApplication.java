package com.example.devops.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class SpringBootTutorialBasicsApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootTutorialBasicsApplication.class, args);
        for (String name: applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}
