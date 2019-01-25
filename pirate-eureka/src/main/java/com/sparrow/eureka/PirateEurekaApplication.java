package com.sparrow.eureka;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Jack
 */
@EnableSwagger2Doc
@EnableEurekaServer
@SpringBootApplication
public class PirateEurekaApplication extends SpringBootServletInitializer {

    /**
     * 开启eureka basic认证
     */
    @EnableWebSecurity
    public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable();
            super.configure(http);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(PirateEurekaApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PirateEurekaApplication.class);
    }
}
