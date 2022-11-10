package com.jpgestao.cadastroempresasapi.api.controller;

import com.jpgestao.cadastroempresasapi.domain.model.Sociedade;
import com.jpgestao.cadastroempresasapi.domain.repository.SociedadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sociedades")
public class SociedadeController {

    @Autowired
    private SociedadeRepository sociedadeRepository;

    @GetMapping
    public List<Sociedade> listar() {
        return sociedadeRepository.findAll();
    }

    @GetMapping("/{sociedadeId}")
    public Optional<Sociedade> buscar(@PathVariable("sociedadeId") Long id)
    {
        return sociedadeRepository.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Sociedade adicionar(@RequestBody Sociedade sociedade) {
        return sociedadeRepository.save(sociedade); }

}
