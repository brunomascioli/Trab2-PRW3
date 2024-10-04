package com.example.oficina_carros.DTOs;

import com.example.oficina_carros.models.Mecanico;
import com.example.oficina_carros.models.Veiculo;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
public record ConsertoDTO(
       @NotNull
       String data_entrada,
       @NotNull
       String data_saida,
       @Valid @Embedded
       Mecanico mecanico,
       @Valid @Embedded
       Veiculo veiculo
) {
}
