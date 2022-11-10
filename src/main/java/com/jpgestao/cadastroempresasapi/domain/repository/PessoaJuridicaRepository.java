package com.jpgestao.cadastroempresasapi.domain.repository;

import com.jpgestao.cadastroempresasapi.domain.model.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
