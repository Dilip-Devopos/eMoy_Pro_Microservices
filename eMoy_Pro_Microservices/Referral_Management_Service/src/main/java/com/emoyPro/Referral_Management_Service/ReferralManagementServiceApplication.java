package com.emoyPro.Referral_Management_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ReferralManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReferralManagementServiceApplication.class, args);
	}

}
