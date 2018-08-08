package com.sparrow.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jack
 */
@ComponentScan(basePackages = {"com.sparrow"})
@SpringCloudApplication
public class PirateCmsWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PirateCmsWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PirateCmsWebApplication.class);
    }
}
