package com.example.oficina_carros.repository;

import com.example.oficina_carros.models.Conserto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsertoRepository extends JpaRepository<Conserto, Long> {
}
