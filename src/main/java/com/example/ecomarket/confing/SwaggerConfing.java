package com.example.ecomarket.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info; // <-- Agrega esta línea

@Configuration
public class SwaggerConfing {
    @Bean
    public OpenAPI custOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("usuario API")
                        .version("1.0")
                        .description("documentacion de la API para el sistema de usuarios"));
    }
    
}
