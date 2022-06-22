package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Usuario;
import br.com.panfletonline.Repository.UsuarioRepository;
import br.com.panfletonline.Validations.Validations;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@GetMapping
	public String validaUsuario(@RequestParam(required = true) String email, @RequestParam(required = true) String senha) {
	
		Validations validations = new Validations();
		if (usuarioRepository.validaUsuario(email, senha)>0) {
			return validations.geraHash(email);
		}else {
			return "[]";
		}
		
		
		
		
	}

}
