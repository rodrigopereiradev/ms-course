package com.devsuperior.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication implements CommandLineRunner {
    @Value(value = "${spring.cloud.config.server.git.username}")
    private String userName;
    @Value(value = "${spring.cloud.config.server.git.password}")
    private String password;

    public static void main(String[] args) {
        SpringApplication.run(HrConfigServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("USER NAME GIT = " + userName);
//        System.out.println("PASSWORD = " + password);
    }
}
