package cn.wen.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "cn.wen")  
@EnableEurekaServer
public class serverMain {

	public static void main(String[] args){
		SpringApplication.run(serverMain.class, args);
	}
}
