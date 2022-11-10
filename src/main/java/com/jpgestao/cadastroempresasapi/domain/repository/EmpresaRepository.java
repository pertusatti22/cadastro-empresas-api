package com.jpgestao.cadastroempresasapi.domain.repository;

import com.jpgestao.cadastroempresasapi.domain.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
