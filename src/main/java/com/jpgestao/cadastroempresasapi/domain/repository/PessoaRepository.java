package com.jpgestao.cadastroempresasapi.domain.repository;

import com.jpgestao.cadastroempresasapi.domain.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;



@NoRepositoryBean
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
