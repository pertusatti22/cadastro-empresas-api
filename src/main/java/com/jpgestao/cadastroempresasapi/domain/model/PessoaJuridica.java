package com.jpgestao.cadastroempresasapi.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PessoaJuridica extends Pessoa {

    @Column(nullable = false)
    private String cnpj;

    @Column(nullable = false)
    private String razaoSocial;

    @Column(nullable = false)
    private String nomeFantasia;
}
