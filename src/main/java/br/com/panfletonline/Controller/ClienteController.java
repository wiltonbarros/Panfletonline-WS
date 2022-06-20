package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Cliente;
import br.com.panfletonline.Entity.Usuario;
import br.com.panfletonline.Repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> lista() {
		List<Cliente> clientes = null;
	//	if (nomeCurso == null) {
			clientes = clienteRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return clientes;
	}

}
