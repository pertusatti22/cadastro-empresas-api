package com.jpgestao.cadastroempresasapi.domain.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class PessoaJuridica extends Pessoa {

    @Column(nullable = false)
    private String cnpj;

    @Column(name= "razao_social", nullable = false)
    private String razaoSocial;

    @Column(name= "nome_fantasia", nullable = false)
    private String nomeFantasia;

    @Column
    private String telefone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PessoaJuridica that = (PessoaJuridica) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

