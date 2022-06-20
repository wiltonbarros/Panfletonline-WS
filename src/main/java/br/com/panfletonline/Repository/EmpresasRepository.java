package br.com.panfletonline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.panfletonline.Entity.Empresas;

public interface EmpresasRepository extends JpaRepository<Empresas, Long>{

}
