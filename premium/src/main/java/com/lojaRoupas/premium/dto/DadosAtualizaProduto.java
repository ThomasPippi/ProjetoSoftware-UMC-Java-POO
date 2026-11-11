package com.lojaRoupas.premium.dto;

import com.lojaRoupas.premium.enums.Tamanho;

public record DadosAtualizaProduto (
        Long id,
        String marca,
        String peca,
        Tamanho tamanho,
        String cor,
        int qtde,
        double valor
) {}
