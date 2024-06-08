package med.voll.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
public class CorsConfiguration implements WebMvcConfigurer{

    public void  addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:8080")
                .allowedMethods("GET","PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}
