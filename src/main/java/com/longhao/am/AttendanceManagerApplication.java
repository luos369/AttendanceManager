package com.longhao.am;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.longhao")
public class AttendanceManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceManagerApplication.class, args);
    }

}
