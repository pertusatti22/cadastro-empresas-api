package com.jpgestao.cadastroempresasapi.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Sociedade {

        @Id
        @EqualsAndHashCode.Include
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @OneToOne
        @JoinColumn
        private PessoaJuridica pessoaJuridica;

        @OneToOne
        @JoinColumn
        private Pessoa pessoa;
    }

