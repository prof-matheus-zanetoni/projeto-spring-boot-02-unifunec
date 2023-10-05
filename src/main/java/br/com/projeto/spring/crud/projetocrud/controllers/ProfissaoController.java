package br.com.projeto.spring.crud.projetocrud.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @PutMapping
    public void alterar(@RequestBody @Valid Profissao profissao) {
        profissaoService.gravar(profissao);
    }

    @GetMapping
    public List<Profissao> listar() {
        return profissaoService.listar();
    }

    @GetMapping("/{codigoProfissao}")
    public Profissao consultar(@PathVariable Long codigoProfissao) {
        return profissaoService.consultar(codigoProfissao);
    }

    @DeleteMapping("/{codigoProfissao}")
    public void excluir(@PathVariable Long codigoProfissao) {
        profissaoService.excluir(codigoProfissao);
    }
}