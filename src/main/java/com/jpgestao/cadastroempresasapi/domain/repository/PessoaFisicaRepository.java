package com.jpgestao.cadastroempresasapi.domain.repository;

import com.jpgestao.cadastroempresasapi.domain.model.PessoaFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Long> {
}
