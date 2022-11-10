package com.jpgestao.cadastroempresasapi.api.controller;

import com.jpgestao.cadastroempresasapi.domain.model.PessoaFisica;
import com.jpgestao.cadastroempresasapi.domain.model.PessoaJuridica;
import com.jpgestao.cadastroempresasapi.domain.repository.PessoaFisicaRepository;
import com.jpgestao.cadastroempresasapi.domain.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/juridicas")
public class PessoaJuridicaController {

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @GetMapping
    public List<PessoaJuridica> listar() {
        return pessoaJuridicaRepository.findAll();
    }

    @GetMapping("/{juridicaId}")
    public Optional<PessoaJuridica> buscar(@PathVariable("juridicaId") Long id) {
        return pessoaJuridicaRepository.findById(id);
    }
}
