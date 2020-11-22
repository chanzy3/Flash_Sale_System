package com.chengzhi.seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.chengzhi"})
@SpringBootApplication
@MapperScan("com.chengzhi.seckill.db.mappers")

public class SeckillApplication {
    public static void main(String[] args) {

        SpringApplication.run(SeckillApplication.class, args);
    }
}
