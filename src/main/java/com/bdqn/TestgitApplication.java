package com.bdqn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bdqn.mapper")
public class TestgitApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestgitApplication.class, args);
    }

}
