package com.lojaRoupas.premium.controllers;

import com.lojaRoupas.premium.dto.DadosCadastroProduto;
import com.lojaRoupas.premium.dto.DadosListagemProduto;
import com.lojaRoupas.premium.model.Produto;
import com.lojaRoupas.premium.repository.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private RepositoryProduto repositoryProduto;

    @PostMapping
    public void cadastrarProduto(@RequestBody DadosCadastroProduto produto) {
        repositoryProduto.save(new Produto(produto));
    }

// COMUM
//    @GetMapping
//    public List<DadosListagemProduto> listarProdutos() {
//        return repositoryProduto.findAll().stream().map(DadosListagemProduto::new).toList();
//    }
// PAGINAÇÃO
    @GetMapping
    public Page<DadosListagemProduto> listarProdutos2(Pageable pageable) {
        return repositoryProduto.findAll(pageable).map(DadosListagemProduto::new);
    }
}
