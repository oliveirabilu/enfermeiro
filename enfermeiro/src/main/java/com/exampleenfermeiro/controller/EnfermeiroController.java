package com.exampleenfermeiro.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enfermeiros")
public class EnfermeiroController {
    @PostMapping
    public  void cadastrar (@RequestBody String Json){
        System.out.println(Json);
    }
}
