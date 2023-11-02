package br.com.projeto.spring.crud.projetocrud.configurations;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.projeto.spring.crud.projetocrud.components.AuthFilter;

@Configuration
public class AppConfiguration {
    @Bean
    public FilterRegistrationBean<AuthFilter> authorizationFilterConfig (AuthFilter authorizationFilter) {
        FilterRegistrationBean<AuthFilter> authorizationFilterConfig = new FilterRegistrationBean<>();
        authorizationFilterConfig.setFilter(authorizationFilter);
        authorizationFilterConfig.addUrlPatterns("/api/*");
        return authorizationFilterConfig;
    }
}