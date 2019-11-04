package com.zcq;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@MapperScan(value={"com.zcq.mapper"})
public class MybatisBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisBootApplication.class, args);
    }


}
