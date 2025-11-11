package com.exampleenfermeiro.repositories;

import com.exampleenfermeiro.entities.Enfermeiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermeiroRepository extends JpaRepository<Enfermeiro, Long> {
}
