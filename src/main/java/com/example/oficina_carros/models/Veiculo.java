package com.example.oficina_carros.models;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@NotNull
public class Veiculo {
    private String marca_veiculo;
    private String modelo_veiculo;
    private Integer ano_fabricacao;
}
