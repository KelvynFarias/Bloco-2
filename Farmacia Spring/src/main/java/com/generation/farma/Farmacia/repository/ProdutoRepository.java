package com.generation.farma.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.farma.Farmacia.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    public List <Produto> findAllByMarcaContainingIgnoreCase (String marca);

}
