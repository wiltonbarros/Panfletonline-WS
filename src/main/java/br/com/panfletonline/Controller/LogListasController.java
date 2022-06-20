package br.com.panfletonline.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.panfletonline.Entity.LogListas;
import br.com.panfletonline.Repository.LogListasRepository;

@RestController
@RequestMapping("/loglistas")
public class LogListasController {
	
	@Autowired
	LogListasRepository logListasRepository;
	
	@GetMapping
	public List<LogListas> lista() {
		List<LogListas> logListas = null;
	//	if (nomeCurso == null) {
			logListas = logListasRepository.findAll();
		//}else {
		//	topicos = topicoRepository.findByCurso_Nome(nomeCurso);
		//}
		
		return logListas;
	}
	

}
