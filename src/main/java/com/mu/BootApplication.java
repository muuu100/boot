package com.mu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        System.out.println("start。。。");
        SpringApplication.run(BootApplication.class, args);
        System.out.println("end。。。");
    }

}
