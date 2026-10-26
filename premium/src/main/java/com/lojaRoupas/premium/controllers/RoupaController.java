package com.lojaRoupas.premium.controllers;

import com.lojaRoupas.premium.dto.DadosCadastroRoupa;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roupa")
public class RoupaController {

    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastroRoupa roupa) {
        System.out.println("Cadastrado: " + roupa);
//        return roupa;
    }

    @GetMapping
    public String listarRoupas() {
        System.out.println("Listando roupas");
        return "Listar Roupas";
    }
}
