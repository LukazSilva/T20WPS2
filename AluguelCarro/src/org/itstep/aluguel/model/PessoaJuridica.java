package org.itstep.aluguel.model;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	private String responsavel;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
	@Override
	public Integer gerarCodigoUnico() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String conerteData(Date data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
