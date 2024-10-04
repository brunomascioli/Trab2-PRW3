package com.example.oficina_carros.controller;

import com.example.oficina_carros.DTOs.ConsertoDTO;
import com.example.oficina_carros.models.Conserto;
import com.example.oficina_carros.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
