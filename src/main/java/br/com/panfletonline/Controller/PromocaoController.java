package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.Promocao;
import br.com.panfletonline.Entity.Usuario;
import br.com.panfletonline.Repository.PromocaoRepository;

@RestController
@RequestMapping("/promocao")
public class PromocaoController {
	
	@Autowired
	PromocaoRepository promocaoRepository;
	
	@GetMapping
	public List<Promocao> lista() {
		List<Promocao> promocao = null;
	//	if (nomeCurso == null) {
			promocao = promocaoRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return promocao;
	}

}
