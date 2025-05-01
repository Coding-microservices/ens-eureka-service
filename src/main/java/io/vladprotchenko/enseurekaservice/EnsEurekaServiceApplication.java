package io.vladprotchenko.enseurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EnsEurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnsEurekaServiceApplication.class, args);
    }

}
