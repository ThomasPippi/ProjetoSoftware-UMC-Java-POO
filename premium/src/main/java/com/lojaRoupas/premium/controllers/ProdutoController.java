package com.lojaRoupas.premium.controllers;

import com.lojaRoupas.premium.dto.DadosAtualizaProduto;
import com.lojaRoupas.premium.dto.DadosCadastroProduto;
import com.lojaRoupas.premium.dto.DadosListagemProduto;
import com.lojaRoupas.premium.model.Produto;
import com.lojaRoupas.premium.repository.RepositoryProduto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private RepositoryProduto repositoryProduto;

    @PostMapping
    @Transactional
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
    //GET COM FILTRO
    @GetMapping("/marca/{marca}")
    public Page<DadosListagemProduto> listarProdutosPorMarca(@PathVariable String marca, Pageable pageable) {
        return repositoryProduto.findByMarca(marca, pageable).map(DadosListagemProduto::new);
    }
    //Buscar
    @GetMapping("/buscar")
    public Page<DadosListagemProduto> listarProdutosMarcaPorBuscar(@RequestParam String marca, Pageable pageable) {
        return repositoryProduto.findByMarcaContainingIgnoreCase(marca, pageable).map(DadosListagemProduto::new);
    }

    @PutMapping
    @Transactional //Garante o sucesso da transação ou dá rollback
    public void atualizarProduto(@RequestBody DadosAtualizaProduto oldProduto) {
        var newProduto = repositoryProduto.getReferenceById(oldProduto.id());
        newProduto.updateInfo(oldProduto);
    }

    @DeleteMapping("{id}")
    @Transactional
    public  void deletaProduto(@PathVariable Long id){
        repositoryProduto.deleteById(id);
    }
}
