package com.jpgestao.cadastroempresasapi.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PessoaFisica extends Pessoa {

    @Column(name= "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String cpf;
}
