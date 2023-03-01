package com.dio.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBconfiguration {
    
    private String driverClassName;
    private String url;
    private String username;
    private String password;


    @Profile("dev")
    @Bean
    public String testDatabaseConnection() {
        
        System.out.println("DB connection for DEV - h2");
        System.out.println(driverClassName);
        System.out.println(url);
        
        return "DB connection to h2_test - test instance";
    }

    
}
