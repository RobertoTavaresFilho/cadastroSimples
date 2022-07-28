package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import datasource.model.Cadastro;

public interface CadastroRepository 
			extends JpaRepository<Cadastro, Long>{

}
