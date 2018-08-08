package com.sparrow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jack
 */
@ComponentScan(basePackages = {"com.sparrow"})
//@EnableSwagger2
//@EnableFeignClients
@SpringCloudApplication
public class PirateOmsWebApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PirateOmsWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PirateOmsWebApplication.class);
    }
}
