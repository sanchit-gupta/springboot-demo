package com.companies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
//
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration

@SpringBootApplication
public class CompanyApplication {
 
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CompanyApplication.class, args);

        System.out.println("printlns from running Application");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}