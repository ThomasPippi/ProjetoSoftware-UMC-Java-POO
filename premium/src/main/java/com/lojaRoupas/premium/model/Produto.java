package com.lojaRoupas.premium.model;

import com.lojaRoupas.premium.dto.DadosAtualizaProduto;
import com.lojaRoupas.premium.dto.DadosCadastroProduto;
import com.lojaRoupas.premium.enums.Tamanho;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Produto")
@Table(name = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String peca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private String cor;
    private int qtde;
    private double valor;

    public Produto(DadosCadastroProduto produto) {
        this.marca = produto.marca();
        this.peca = produto.peca();
        this.tamanho = produto.tamanho();
        this.cor = produto.cor();
        this.qtde = produto.qtde();
        this.valor = produto.valor();
    }

    public void updateInfo(DadosAtualizaProduto oldProduto) {
        if (oldProduto.marca() != null || !oldProduto.marca().isBlank()) {
            this.marca = oldProduto.marca();
        }
        if (oldProduto.peca() != null) {
            this.peca = oldProduto.peca();
        }
        if (oldProduto.tamanho() != null) {
            this.tamanho = oldProduto.tamanho();
        }
        if (oldProduto.cor() != null) {
            this.cor = oldProduto.cor();
        }
        if (oldProduto.qtde() >= 0) {
            this.qtde = oldProduto.qtde();
        }
        if (oldProduto.valor() >= 0) {
            this.valor = oldProduto.valor();
        }
    }

}
