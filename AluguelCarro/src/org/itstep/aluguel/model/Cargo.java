package org.itstep.aluguel.model;

public class Cargo {

	//Atributo
	private Integer codigo;
	private String  descricao;
	private String  funcao; //O que este cargo faz.
	
	//Getter and Setter
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	
	
}
