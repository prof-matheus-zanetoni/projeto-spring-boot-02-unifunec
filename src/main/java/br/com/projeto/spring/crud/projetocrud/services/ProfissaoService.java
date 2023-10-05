package br.com.projeto.spring.crud.projetocrud.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.projeto.spring.crud.projetocrud.entities.Profissao;
import br.com.projeto.spring.crud.projetocrud.exceptions.DataNotFoundException;
import br.com.projeto.spring.crud.projetocrud.repositories.ProfissaoRepository;

@Service
public class ProfissaoService {
    
    @Autowired
    private ProfissaoRepository profissaoRepository;
    
    public void gravar(Profissao profissao) {
        profissaoRepository.save(profissao);
    }

    public Profissao consultar(Long codigoProfissao) {
        return profissaoRepository.findById(codigoProfissao)
        .orElseThrow(() -> 
        new DataNotFoundException("Profissão não encontrada"));
    }

    public List<Profissao> listar() {
        return profissaoRepository.findAll();
    }

    public void excluir(Long codigoProfissao) {
        profissaoRepository.deleteById(codigoProfissao);
    }
}