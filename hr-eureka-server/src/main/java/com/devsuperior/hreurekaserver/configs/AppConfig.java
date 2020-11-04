package com.devsuperior.hreurekaserver.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class AppConfig {

    @Bean(name = "bCryptPasswordEncoder")
    public BCryptPasswordEncoder getBcryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
