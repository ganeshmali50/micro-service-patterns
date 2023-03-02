package com.infotech.enquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.infotech.enquiryservice")
public class EnquiryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnquiryServiceApplication.class, args);
    }

}
