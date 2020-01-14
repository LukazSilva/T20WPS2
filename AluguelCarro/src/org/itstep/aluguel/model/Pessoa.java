package org.itstep.aluguel.model;

import java.util.Date;

public abstract class Pessoa {

	//Atributos comuns
	private Integer  codigo;
	private String   nome;
	private String   email;
	private Endereco endereco;
	private Telefone telefone;
	private String   senha;
	
	//Metodos a serem implementados
	public abstract Integer gerarCodigoUnico();
	public abstract String  converteData(Date data);
	
	
	//Getter and Setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	
	
	
}
