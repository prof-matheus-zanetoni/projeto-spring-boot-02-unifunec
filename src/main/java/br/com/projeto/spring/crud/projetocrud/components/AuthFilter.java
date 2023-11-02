package br.com.projeto.spring.crud.projetocrud.components;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class AuthFilter extends OncePerRequestFilter {
    @Value("${origem}")
    private String origem;

    @Value("${cabecalhos}")
    private String cabecalhos;

    @Value("${metodos}")
    private String metodos;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.setHeader("Access-Control-Allow-Origin", this.origem);
        response.setHeader("Access-Control-Allow-Headers", this.cabecalhos);
        response.setHeader("Access-Control-Allow-Methods", this.metodos);
        response.setStatus(HttpStatus.OK.value());
        filterChain.doFilter(request, response);
    }
}