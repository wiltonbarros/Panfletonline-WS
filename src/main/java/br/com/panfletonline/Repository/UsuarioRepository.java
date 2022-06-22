package br.com.panfletonline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.panfletonline.Entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value ="SELECT count(a.id) from usuario a WHERE a.email = :email "
			 + "and a.senha = :senha ", nativeQuery = true)
int validaUsuario(@Param(value =  "email") String email,@Param(value =  "senha") String senha);

}
