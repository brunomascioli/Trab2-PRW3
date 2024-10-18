package com.example.oficina_carros.models.conserto;

import com.example.oficina_carros.models.mecanico.Mecanico;
import com.example.oficina_carros.models.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "conserto")
@Entity(name = "Conserto")
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
        this.mecanico = new Mecanico(consertoDTO.mecanico());
        this.veiculo = new Veiculo(consertoDTO.veiculo());
    }
}
