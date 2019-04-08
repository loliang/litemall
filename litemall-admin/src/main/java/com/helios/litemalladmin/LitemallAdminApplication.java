package com.helios.litemalladmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.helios.litemalladmin.dao")
public class LitemallAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(LitemallAdminApplication.class, args);
    }

}
