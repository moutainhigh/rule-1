package com.ht.rule.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableFeignClients(basePackages = {"com.ht.ussp.client","com.ht.rule.config.rpc"})
@EnableDiscoveryClient
@SpringCloudApplication
@MapperScan("com.ht.rule.common.api.mapper")
@EnableTransactionManagement 
@ComponentScan(basePackages= {"com.ht.rule.config","com.ht.rule.common.exception","com.ht.ussp.bean"})
//////@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class RuleConfigApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RuleConfigApplication.class, args);
		System.err.println("ヾ(◍°∇°◍)ﾉﾞ    RuleConfigApplication      ヾ(◍°∇°◍)ﾉﾞ\n");
	}

}
