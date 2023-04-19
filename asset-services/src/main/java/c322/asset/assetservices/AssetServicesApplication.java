package c322.asset.assetservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AssetServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssetServicesApplication.class, args);
	}

	@Bean

	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
