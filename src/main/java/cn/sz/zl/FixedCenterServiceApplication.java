package cn.sz.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FixedCenterServiceApplication {

		public static void main(String[] args) {
			SpringApplication.run(FixedCenterServiceApplication.class,args);
		
	}
	
}
