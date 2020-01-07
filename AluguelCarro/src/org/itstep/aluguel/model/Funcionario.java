package org.itstep.aluguel.model;

import java.util.Date;

public class Funcionario extends PessoaFisica {
	
	private Double Salario;
	private Date dtAdmicao;
	private Date dtDemissao;
	private Cargo cargo;

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	public Date getDtAdmicao() {
		return dtAdmicao;
	}

	public void setDtAdmicao(Date dtAdmicao) {
		this.dtAdmicao = dtAdmicao;
	}

	public Date getDtDemissao() {
		return dtDemissao;
	}

	public void setDtDemissao(Date dtDemissao) {
		this.dtDemissao = dtDemissao;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

}
