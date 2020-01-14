package org.itstep.aluguel.facade;

import java.util.Date;

import org.itstep.aluguel.model.Cliente;
import org.itstep.aluguel.model.DocumentoPessoaFisica;
import org.itstep.aluguel.model.Endereco;
import org.itstep.aluguel.model.PessoaFisica;
import org.itstep.aluguel.model.Telefone;

public class ClienteFacade {

	
	public Cliente buscaCliente(Integer codigo) {
		
		//Busca Banco de Dados
		//Aula do dia 11
		//Mocar dados
		String tipoPessoa = "PF";
		
		Cliente cliente = new Cliente();
		
		if ("PF".equals(tipoPessoa)) {
		
			DocumentoPessoaFisica documentoPessoaFisica = new DocumentoPessoaFisica();
			documentoPessoaFisica.setCpf("12345678901");
			documentoPessoaFisica.setDtEmissaoRG(new Date());
			documentoPessoaFisica.setHabilitacao("12345");
			documentoPessoaFisica.setOrgaoEmissor("Detran");
			documentoPessoaFisica.setRg("12345");
			
			Endereco endereco = new Endereco();
			endereco.setBairro("Barra");
			endereco.setCep("12345678");
			endereco.setCidade("Rio de Janeiro");
			endereco.setComplemento("loja A- 3o Andar");
			endereco.setLogradouro("Av. das Americas");
			endereco.setNumero("3555");
			endereco.setUf("RJ");
			
			Telefone telefone = new Telefone();
			telefone.setDdd(21);
			telefone.setDdi(55);
			telefone.setNumero(12345678);
			telefone.setRamal("");
			telefone.setTipoRC("R");
			telefone.setTipoTel("Celular");
			
			PessoaFisica pessoaFisica = new PessoaFisica();
			
			pessoaFisica.setCodigo(codigo);
			pessoaFisica.setDocumentoPessoaFisica(documentoPessoaFisica);
			pessoaFisica.setDtNascimento(new Date());
			pessoaFisica.setEmail("anderson.santana@itstep.org");
			pessoaFisica.setEndereco(endereco);
			pessoaFisica.setNome("Anderson");
			pessoaFisica.setSexo("M");
			pessoaFisica.setTelefone(telefone);
			
			cliente.setPessoaFisica(pessoaFisica);
			
		} else {
			
		}
		
		return cliente;
		
	}
	
}
