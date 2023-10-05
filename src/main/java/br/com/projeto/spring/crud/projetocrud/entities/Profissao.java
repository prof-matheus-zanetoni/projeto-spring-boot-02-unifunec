package br.com.projeto.spring.crud.projetocrud.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profissao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_profissao", nullable = false)
    private Long codigoProfissao;

    @Column(name = "nome_profissao", nullable = false)
    @NotBlank(message = "O nome da profissão deve ser preenchido")
    private String nomeProfissao;

}