package org.itstep.aluguel.model;

public class Telefone {
	
	private Integer ddi;
	private Integer ddd;
	private Integer numero;
	private String ramal;
	private String tipoTel; //celular ou fixo
	private String tipoRC; //residencial ou comercial
	
	
	public Integer getDdi() {
		return ddi;
	}
	public void setDdi(Integer ddi) {
		this.ddi = ddi;
	}
	
	
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	
	
	public String getTipoTel() {
		return tipoTel;
	}
	public void setTipoTel(String tipoTel) {
		this.tipoTel = tipoTel;
	}
	
	
	public String getTipoRC() {
		return tipoRC;
	}
	public void setTipoRC(String tipoRC) {
		this.tipoRC = tipoRC;
	}
	

}
