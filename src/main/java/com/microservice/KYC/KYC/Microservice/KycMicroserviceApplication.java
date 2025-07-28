package com.microservice.KYC.KYC.Microservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "KYC API", version = "1.0", description = "KYC Verification Service"))
public class KycMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KycMicroserviceApplication.class, args);
	}

}
