package com.jpgestao.cadastroempresasapi.domain.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public abstract class Pessoa {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Enumerated(value= EnumType.STRING)
    private PessoaType type;

    @OneToOne
    @JoinColumn
    private Endereco endereco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Pessoa pessoa = (Pessoa) o;
        return id != null && Objects.equals(id, pessoa.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
