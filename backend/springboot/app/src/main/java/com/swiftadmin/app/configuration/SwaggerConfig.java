package com.swiftadmin.app.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI swiftAdminOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Swift Admin")
                        .version("1.0")
                        .description("Swift Admin API"));
    }
}