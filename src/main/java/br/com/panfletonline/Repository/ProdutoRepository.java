package br.com.panfletonline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.panfletonline.Entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
