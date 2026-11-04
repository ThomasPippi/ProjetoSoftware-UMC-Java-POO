package com.lojaRoupas.premium.dto;

import com.lojaRoupas.premium.enums.Tamanho;

public record DadosCadastroProduto(
        String marca,
        String peca,
        Tamanho tamanho,
        String cor,
        int qtde,
        double valor
) {}
