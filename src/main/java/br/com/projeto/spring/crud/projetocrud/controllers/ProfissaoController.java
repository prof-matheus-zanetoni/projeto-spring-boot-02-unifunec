package br.com.projeto.spring.crud.projetocrud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.projeto.spring.crud.projetocrud.entities.Profissao;
import br.com.projeto.spring.crud.projetocrud.services.ProfissaoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/profissao")
public class ProfissaoController {
    
    @Autowired
    private ProfissaoService profissaoService;

    @PostMapping
    public void inserir(@RequestBody @Valid Profissao profissao) {
        profissaoService.gravar(profissao);
    }
}