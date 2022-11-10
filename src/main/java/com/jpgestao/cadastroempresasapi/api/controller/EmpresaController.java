package com.jpgestao.cadastroempresasapi.api.controller;

import com.jpgestao.cadastroempresasapi.domain.model.Empresa;
import com.jpgestao.cadastroempresasapi.domain.repository.EmpresaRepository;
import com.jpgestao.cadastroempresasapi.domain.repository.PessoaFisicaRepository;
import com.jpgestao.cadastroempresasapi.domain.repository.PessoaJuridicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private PessoaFisicaRepository pessoaFisicaRepository;

    @Autowired
    private PessoaJuridicaRepository pessoaJuridicaRepository;

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    @GetMapping("/{empresaId}")
    public ResponseEntity<Empresa> buscar(@PathVariable Long empresaId) {
        Optional<Empresa> empresa = empresaRepository.findById(empresaId);

        return empresa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
}
