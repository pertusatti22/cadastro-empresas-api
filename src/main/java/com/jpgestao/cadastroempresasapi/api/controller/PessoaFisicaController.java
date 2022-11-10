package com.jpgestao.cadastroempresasapi.api.controller;

import com.jpgestao.cadastroempresasapi.domain.model.PessoaFisica;
import com.jpgestao.cadastroempresasapi.domain.repository.PessoaFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fisicas")
public class PessoaFisicaController {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @GetMapping
    public List<PessoaFisica> listar() {
        return pessoaFisicaRepository.findAll();
    }

    @GetMapping("/{fisicaId}")
    public Optional<PessoaFisica> buscar(@PathVariable("fisicaId") Long id){
        return pessoaFisicaRepository.findById(id);
    }
}
