package br.com.projeto.spring.crud.projetocrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.projeto.spring.crud.projetocrud.entities.Profissao;

@Repository
public interface ProfissaoRepository extends JpaRepository<Profissao, Long> {
    
}