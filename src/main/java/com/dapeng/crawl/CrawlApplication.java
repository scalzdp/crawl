package com.dapeng.crawl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CrawlApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlApplication.class, args);
    }

}
