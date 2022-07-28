package service;



import org.springframework.beans.factory.annotation.Autowired;

import datasource.model.Cadastro;
import repository.CadastroRepository;



public class cadastroCadastro {
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public void cadastrar(Cadastro cadastro) {
		cadastroRepository.saveAndFlush(cadastro);
		
	}

}
