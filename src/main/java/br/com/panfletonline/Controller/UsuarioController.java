package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Usuario;
import br.com.panfletonline.Repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@GetMapping
	public int lista(@RequestParam(required = true) String email, @RequestParam(required = true) String senha) {
		List<Usuario> usuarios = null;
	//	if (nomeCurso == null) {
			//usuarios = usuarioRepository.findAll();
		
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return usuarioRepository.validaUsuario(email, senha);
	}

}
