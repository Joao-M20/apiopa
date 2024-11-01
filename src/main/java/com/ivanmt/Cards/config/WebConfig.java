package com.ivanmt.Cards.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class WebConfig  implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aplica o CORS para todos os endpoints
                .allowedOrigins("http://localhost:5500") // Permitir a origem do frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*") // Permite todos os headers
                .allowCredentials(true); // Permite credenciais (cookies, headers de autenticação)
    }


    //@Bean
    //CorsConfigurationSource corsConfigurationSource() {
    //    CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
    //    configuration.setAllowedMethods(Arrays.asList("POST", "GET", "PUT", "DELETE", "OPTIONS"));
    //    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    //    source.registerCorsConfiguration("/**", configuration);
    //    return source;
    //}

}
