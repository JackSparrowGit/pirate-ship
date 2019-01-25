package com.sparrow.jade;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableSwagger2Doc
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
@SpringCloudApplication
public class PirateJadeApplication {

    @GetMapping("jade")
    public String hello(){
        return "hello jade";
    }

    public static void main(String[] args) {
        SpringApplication.run(PirateJadeApplication.class, args);
    }

}

