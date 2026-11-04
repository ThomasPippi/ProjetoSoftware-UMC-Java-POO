package com.lojaRoupas.premium.model;

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
}
