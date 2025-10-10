package com.pm.apigateway.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerGatewayConfig {

    @Bean
    public GroupedOpenApi patientApi() {
        return GroupedOpenApi.builder()
                .group("Patient Service")
                .pathsToMatch("/api/patients/**")
                .build();
    }

    @Bean
    public GroupedOpenApi authApi() {
        return GroupedOpenApi.builder()
                .group("Auth Service")
                .pathsToMatch("/auth/**")
                .build();
    }
}