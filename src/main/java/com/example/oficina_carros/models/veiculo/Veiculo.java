package com.example.oficina_carros.models.veiculo;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {
    private String marca_veiculo;
    private String modelo_veiculo;
    private String ano_fabricacao;
    private String cor_veiculo;

    public Veiculo(VeiculoDTO veiculoDTO) {
        this.marca_veiculo = veiculoDTO.marca_veiculo();
        this.modelo_veiculo = veiculoDTO.modelo_veiculo();
        this.ano_fabricacao = veiculoDTO.ano_fabricacao();
        this.cor_veiculo = veiculoDTO.cor_veiculo();
    }
}
