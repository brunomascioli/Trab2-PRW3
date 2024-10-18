package com.example.oficina_carros.models.conserto;

public record DadosListagemConserto(
        String data,
        String nomeMecanico,
        String marcaVeiculo,
        String modeloVeiculo
) {
    public DadosListagemConserto(Conserto conserto) {
        this (
                conserto.getData_entrada(),
                conserto.getMecanico().getNome_mecanico(),
                conserto.getVeiculo().getMarca_veiculo(),
                conserto.getVeiculo().getModelo_veiculo()
        );
    }
}
