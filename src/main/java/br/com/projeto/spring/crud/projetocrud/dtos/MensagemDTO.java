package br.com.projeto.spring.crud.projetocrud.dtos;

import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MensagemDTO {
    
    private List<String> mensagem;

    public MensagemDTO(String mensagem) {
        this.mensagem = Collections.singletonList(mensagem);
    }
}