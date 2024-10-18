package com.example.oficina_carros.models.mecanico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record MecanicoDTO (
    @NotBlank
    String nome_mecanico,
    @NotNull
    int anosExperienciaMecanico
){}
