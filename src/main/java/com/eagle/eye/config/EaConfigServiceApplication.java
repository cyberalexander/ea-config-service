package com.eagle.eye.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EaConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EaConfigServiceApplication.class, args);
    }

}
