package com.jpgestao.cadastroempresasapi.domain.repository;

import com.jpgestao.cadastroempresasapi.domain.model.Sociedade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SociedadeRepository extends JpaRepository<Sociedade, Long> {
}
