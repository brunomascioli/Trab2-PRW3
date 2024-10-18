CREATE TABLE conserto (
      id BIGINT NOT NULL AUTO_INCREMENT,
      data_entrada VARCHAR(10) NOT NULL,
      data_saida VARCHAR(10) NOT NULL,
      nome_mecanico VARCHAR(100) NOT NULL,
      anos_experiencia_mecanico INT NOT NULL,
      marca_veiculo VARCHAR(100) NOT NULL,
      modelo_veiculo VARCHAR(100) NOT NULL,
      ano_fabricacao INT NOT NULL,
      CONSTRAINT pk_conserto_id PRIMARY KEY (id)
);