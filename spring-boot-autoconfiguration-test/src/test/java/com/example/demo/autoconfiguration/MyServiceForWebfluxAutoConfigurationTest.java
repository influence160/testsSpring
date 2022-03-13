package com.example.demo.autoconfiguration;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;

public class MyServiceForWebfluxAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(MyServiceForWebfluxAutoConfiguration.class));

    @Configuration
    @EnableAutoConfiguration()
    static class TestAutoconfiguration {

    }

    @Test
    void testAutoconfigured() {
        this.contextRunner.withUserConfiguration(TestAutoconfiguration.class)
                .withPropertyValues("myservice.auto=true")
                .run((context) -> {
                    assertThat(context).hasSingleBean(MyService.class);
                });
    }

}
