package com.example.demo;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestHeadersSpec;

@Component
public class GoogleHealthIndicator implements HealthIndicator {


    @Override
    public Health health() {
        if (!check()) {
            return Health.down().withDetail("Error Code", "je sais pas").build();
        }
        return Health.up().build();
    }

	private boolean check() {
		try {
			RequestHeadersSpec response = WebClient.create("http://www.google.com").get();
			System.out.println(response);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
