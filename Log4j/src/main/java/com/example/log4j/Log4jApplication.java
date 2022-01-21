package com.example.log4j;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mapper")
public class Log4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(Log4jApplication.class, args);
    }

}
