package br.com.panfletonline.Controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
			cidades = cidadesRepository.findAll();
		return cidades;
	}
	
	@PostMapping
	@Transactional
	public ResponseEntity<Cidades> cadastrarCidade(@RequestBody @Valid Cidades cidade){
		cidadesRepository.save(cidade);		
		try {					
			return new ResponseEntity<>(cidadesRepository.save(cidade), HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);			
		}
	}

}
