package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Cidades;
import br.com.panfletonline.Repository.CidadesRepository;

@RestController
@RequestMapping("/cidades")
public class CidadesController {
	
	@Autowired
	CidadesRepository cidadesRepository;
	
	@GetMapping
	public List<Cidades> lista() {
		List<Cidades> cidades = null;
	//	if (nomeCurso == null) {
			cidades = cidadesRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return cidades;
	}

}
