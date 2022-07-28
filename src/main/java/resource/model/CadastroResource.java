package resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CadastroResource {
	
	@JsonProperty("nome_cadastro")
	private String nome;
	private Long cpf;
	private Long id;
	
	public CadastroResource(String nome, Long cpf, Long id) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	

}
