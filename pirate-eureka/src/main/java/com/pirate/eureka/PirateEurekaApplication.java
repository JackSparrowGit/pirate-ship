package com.pirate.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Jack
 */
@EnableEurekaServer
@SpringBootApplication
public class PirateEurekaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PirateEurekaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PirateEurekaApplication.class);
    }
}