package br.com.projeto.spring.crud.projetocrud.exceptions;

public class DataNotFoundException extends RuntimeException {
    
    public DataNotFoundException(String mensagem) {
        super(mensagem);
    }
}