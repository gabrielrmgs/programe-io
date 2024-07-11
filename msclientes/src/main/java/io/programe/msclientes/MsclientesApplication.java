package io.programe.msclientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MsclientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsclientesApplication.class, args);
	}

}
