package br.com.panfletonline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.panfletonline.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
