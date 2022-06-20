package br.com.panfletonline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.panfletonline.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
