package com.demosystem.studentmanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    
    @Bean
    public OpenAPI studentManagementOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Student Management API")
                .description("Dokumentasi API untuk CRUD Student Management System")
                .version("1.0.0"));
    }
}
