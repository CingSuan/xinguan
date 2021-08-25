package com.jinlin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class XinGuanApplication {
    public static void main(String[] args) {
        SpringApplication.run(XinGuanApplication.class,args);
    }
}
