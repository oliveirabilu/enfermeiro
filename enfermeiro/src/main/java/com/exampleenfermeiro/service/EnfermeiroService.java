package com.exampleenfermeiro.service;

import com.exampleenfermeiro.repositories.EnfermeiroRepository;
import org.springframework.stereotype.Service;

@Service
public class EnfermeiroService {
    EnfermeiroRepository enfermeiroRepository;

    public EnfermeiroService(EnfermeiroRepository enfermeiroRepository) {
        this.enfermeiroRepository = enfermeiroRepository;
    }
}
