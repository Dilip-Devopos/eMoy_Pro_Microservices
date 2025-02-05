package com.emoyPro.User_Mangement_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;




@SpringBootApplication
@ComponentScan(basePackages = "com.emoyPro")
@EnableJpaRepositories(basePackages = "com.emoyPro.User_Mangement_Service_Repositories")
@EntityScan(basePackages = "com.emoyPro.User_Mangement_Service_Entities")
// @EnableTransactionManagement
public class UserMangementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserMangementServiceApplication.class, args);
	}

}
