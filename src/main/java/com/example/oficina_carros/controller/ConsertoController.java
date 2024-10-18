package com.example.oficina_carros.controller;

import com.example.oficina_carros.models.conserto.ConsertoDTO;
import com.example.oficina_carros.models.conserto.Conserto;
import com.example.oficina_carros.models.conserto.DadosListagemConserto;
import com.example.oficina_carros.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conserto")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<Conserto> inserirConserto(@RequestBody @Valid ConsertoDTO consertoDTO){
        Conserto conserto = new Conserto(consertoDTO);
        return ResponseEntity.status(HttpStatus.OK).body(repository.save(conserto));
    }

    @GetMapping
    public Page<Conserto> listarTodosDados(Pageable paginacao) {
        return repository.findAll(paginacao);
    }

    @GetMapping("/principais")
    public List<DadosListagemConserto> listarPrincipaisDados() {
        return repository.findAll().stream().map(DadosListagemConserto::new).toList();
    }

}
