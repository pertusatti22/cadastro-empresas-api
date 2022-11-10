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
public class PessoaFisica extends Pessoa {

    @Column(name= "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String cpf;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
