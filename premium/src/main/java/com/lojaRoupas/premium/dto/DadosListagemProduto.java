package com.lojaRoupas.premium.dto;

import com.lojaRoupas.premium.enums.Tamanho;
import com.lojaRoupas.premium.model.Produto;

public record DadosListagemProduto(
        Long id,
        String marca,
        String peca,
        Tamanho tamanho,
        String cor,
        int qtde,
        double valor
) {
    public DadosListagemProduto(Produto produto) {
        this(produto.getId(), produto.getMarca(), produto.getPeca(), produto.getTamanho(), produto.getCor(), produto.getQtde(), produto.getValor());
    }
}
