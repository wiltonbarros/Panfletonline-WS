package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Listas;
import br.com.panfletonline.Repository.ListasRepository;

@RestController
@RequestMapping("/listas")
public class ListasController {
	
	@Autowired
	ListasRepository listasRepository;
	
	@GetMapping
	public List<Listas> lista() {
		List<Listas> listas = null;
	//	if (nomeCurso == null) {
			listas = listasRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return listas;
	}

}
