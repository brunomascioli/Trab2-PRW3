package com.example.oficina_carros.models;

import com.example.oficina_carros.DTOs.ConsertoDTO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "conserto")
@Entity(name = "Concerto")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String data_entrada;
    private String data_saida;

    @Embedded
    private Mecanico mecanico;

    @Embedded
    private Veiculo veiculo;

    public Conserto(ConsertoDTO consertoDTO) {
        this.data_entrada = consertoDTO.data_entrada();
        this.data_saida = consertoDTO.data_saida();
        this.mecanico = consertoDTO.mecanico();
        this.veiculo = consertoDTO.veiculo();
    }
}
