package com.ibeifeng.hadoop.spring.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * SpringCloudConfigServer
 *	
 * @Description 配置文件服务器
 * @author yanglin
 * @version 1.0,2017年3月23日
 * @see
 * @since
 */
@SpringBootApplication  //相当于@Configuration、@EnableAutoConfiguration和 @ComponentScan
@EnableEurekaServer
public class EurekaServerApp {
    
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }
}
