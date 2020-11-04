package com.devsuperior.hreurekaserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaServer
@SpringBootApplication
public class HrEurekaServerApplication implements CommandLineRunner {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(HrEurekaServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("BCRYPT = " + bCryptPasswordEncoder.encode("12345"));
    }
}
