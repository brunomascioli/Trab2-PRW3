package com.example.oficina_carros.models.veiculo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record VeiculoDTO (
    @NotBlank String marca_veiculo,
    @NotBlank String modelo_veiculo,
    @NotNull @Pattern(regexp = "^(\\d){4}$") String ano_fabricacao,
    String cor_veiculo
) {}
