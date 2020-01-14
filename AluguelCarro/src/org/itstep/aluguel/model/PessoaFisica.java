package org.itstep.aluguel.model;

import java.util.Date;

public class PessoaFisica extends Pessoa {
    //Atributo
	private Date                  dtNascimento;
	private String                sexo;
	private DocumentoPessoaFisica documentoPessoaFisica;

	//Getter and Setter
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public DocumentoPessoaFisica getDocumentoPessoaFisica() {
		return documentoPessoaFisica;
	}
	public void setDocumentoPessoaFisica(DocumentoPessoaFisica documentoPessoaFisica) {
		this.documentoPessoaFisica = documentoPessoaFisica;
	}
	
	
	@Override
	public Integer gerarCodigoUnico() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String converteData(Date data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
