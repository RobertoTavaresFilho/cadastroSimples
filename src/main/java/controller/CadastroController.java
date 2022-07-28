package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import datasource.model.Cadastro;
import repository.CadastroRepository;

@RestController
public class CadastroController {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping(path = "/api/cadastro")
	public java.util.List<Cadastro> buscarCadastro() {
		return cadastroRepository.findAll();		
		
	}
	

}
	