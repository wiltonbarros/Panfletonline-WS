package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Parametro;
import br.com.panfletonline.Repository.ParametroRepository;

@RestController
@RequestMapping("/parametross")
public class ParametroController {
	
	@Autowired
	ParametroRepository parametroRepository;
	
	@GetMapping
	public List<Parametro> lista() {
		List<Parametro> parametro = null;
	//	if (nomeCurso == null) {
			parametro = parametroRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return parametro;
	}

}
