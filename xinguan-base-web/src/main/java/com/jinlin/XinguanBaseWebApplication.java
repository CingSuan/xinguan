package com.jinlin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.jinlin.mapper")
@SpringBootApplication
public class XinguanBaseWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(XinguanBaseWebApplication.class,args);
    }
}
