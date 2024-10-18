package com.example.oficina_carros.models.mecanico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Mecanico {
    private String nome_mecanico;
    private int anos_experiencia_mecanico;

    public Mecanico(MecanicoDTO mecanicoDTO) {
        this.nome_mecanico = mecanicoDTO.nome_mecanico();
        this.anos_experiencia_mecanico = mecanicoDTO.anosExperienciaMecanico();
    }
}
