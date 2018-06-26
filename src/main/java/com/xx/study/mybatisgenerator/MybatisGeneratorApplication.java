package com.xx.study.mybatisgenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.xx.study.mybatisgenerator.dao")
public class MybatisGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }
}
