package com.sparrow.gold;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableSwagger2Doc
@RestController
@SpringCloudApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PirateGoldApplication {

    @GetMapping("gold")
    public String hello(){
        return "hello gold";
    }

    public static void main(String[] args) {
        SpringApplication.run(PirateGoldApplication.class, args);
    }

}

