package com.sparrow.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author Jack
 */
@SpringCloudApplication
public class PirateGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PirateGatewayApplication.class, args);
    }

}
