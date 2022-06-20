package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Estados;
import br.com.panfletonline.Repository.EstadosRepository;

@RestController
@RequestMapping("/estados")
public class EstadosController {
	
	@Autowired
	EstadosRepository estadosRepository;
	
	@GetMapping
	public List<Estados> lista() {
		List<Estados> estados = null;
	//	if (nomeCurso == null) {
			estados = estadosRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return estados;
	}

}
