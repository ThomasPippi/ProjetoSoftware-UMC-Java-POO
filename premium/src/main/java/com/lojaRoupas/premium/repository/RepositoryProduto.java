package com.lojaRoupas.premium.repository;

import com.lojaRoupas.premium.dto.DadosListagemProduto;
import com.lojaRoupas.premium.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {
    Page<Produto> findByMarca(String marca, Pageable pageable);

    Page<Produto> findByMarcaContainingIgnoreCase(String marca, Pageable pageable);
}
