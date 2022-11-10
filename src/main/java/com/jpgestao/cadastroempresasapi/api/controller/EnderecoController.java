package com.jpgestao.cadastroempresasapi.api.controller;

import com.jpgestao.cadastroempresasapi.domain.model.Endereco;
import com.jpgestao.cadastroempresasapi.domain.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping
    public List<Endereco> listar() {
        return enderecoRepository.findAll();
    }

    @GetMapping("/{enderecoId}")
    public ResponseEntity<Endereco> buscar(@PathVariable Long enderecoId) {
        Optional<Endereco> endereco = enderecoRepository.findById(enderecoId);

        return endereco.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
}
