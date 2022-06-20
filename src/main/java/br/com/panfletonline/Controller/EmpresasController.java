package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Empresas;
import br.com.panfletonline.Repository.EmpresasRepository;

@RestController
@RequestMapping("/empresas")
public class EmpresasController {
	
	@Autowired
	EmpresasRepository empresasRepository;
	
	@GetMapping
	public List<Empresas> lista() {
		List<Empresas> empresas = null;
	//	if (nomeCurso == null) {
			empresas = empresasRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return empresas;
	}

}
