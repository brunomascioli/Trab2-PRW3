package com.example.oficina_carros.models;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Mecanico {
    @NotNull private String nome_mecanico;
    @NotNull private Integer anos_experiencia_mecanico;
}
