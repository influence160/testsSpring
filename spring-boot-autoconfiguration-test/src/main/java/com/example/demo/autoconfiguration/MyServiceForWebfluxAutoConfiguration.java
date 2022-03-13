package com.example.demo.autoconfiguration;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(prefix = "myservice", name = "auto", havingValue = "true", matchIfMissing = true)
@ConditionalOnBean(WebFluxAutoConfiguration.WebFluxConfig.class)
@AutoConfigureAfter(WebFluxAutoConfiguration.class)
public class MyServiceForWebfluxAutoConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
