package com.example.demomybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Repository;

@SpringBootApplication
//@MapperScan(basePackages = "com.example.demomybatis.mapper",annotationClass = Repository.class)
//@ComponentScans(value = { @ComponentScan(value = "com.example.demomybatis.*") })
//@MapperScans(value = { @MapperScan("com.example.demomybatis.mapper"), @MapperScan("com.example.demomybatis.*") })
//@MapperScan("com.example.demomybatis.mapper")
@EnableCaching
public class DemomybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemomybatisApplication.class, args);
    }

}
