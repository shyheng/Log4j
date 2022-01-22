package com.example.log4j;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@MapperScan(basePackages = "com.example.log4j.mapper")
@Log4j2
public class Log4jApplication {
    public static void main(String[] args) {
        SpringApplication.run(Log4jApplication.class, args);
        log.info(new Date());
    }

}
