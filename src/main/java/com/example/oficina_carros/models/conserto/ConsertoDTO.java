package com.example.oficina_carros.models.conserto;

import com.example.oficina_carros.models.mecanico.MecanicoDTO;
import com.example.oficina_carros.models.veiculo.VeiculoDTO;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ConsertoDTO(
       @NotBlank
       @Pattern(regexp = "(\\d{2}/){2}(\\d){4}$")
       String data_entrada,
       @NotBlank
       @Pattern(regexp = "(\\d{2}/){2}(\\d){4}$")
       String data_saida,
       @Valid @Embedded @NotNull
       MecanicoDTO mecanico,
       @Valid @Embedded @NotNull
       VeiculoDTO veiculo
) {
}
