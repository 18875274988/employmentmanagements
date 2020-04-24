package com.em.employmentmanagements;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan("com.em.employmentmanagements.mapper")
@ServletComponentScan
@SpringBootApplication
public class EmploymentmanagementsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmploymentmanagementsApplication.class, args);
    }

}
