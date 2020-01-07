<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Cliente</title>
</head>
<body>

	<script type="text/javascript" src="jquery-3.4.1.js"></script>
</head>
<body>

	<form action="">

		<table>

			<tr>
				<td>codigo</td>
				<td><input type="text" id="idCodigo" name="Codigo" value=""></td>
			</tr>


			<tr>
				<td>cpf</td>
				<td><input type="text" id="idCpf" name="Cpf" value=""></td>
			</tr>

			<tr>
				<td>dtEmissaoRG</td>
				<td><input type="text" id="idDtEmissaoRG" name="DtEmissaoRG"
					value=""></td>

			</tr>

			<tr>
				<td>habilitacao</td>
				<td><input type="text" id="idHabilitacao" name="Habilitacao"
					value=""></td>

			</tr>

			<tr>
				<td>orgaoEmissor</td>
				<td><input type="text" id="idOrgaoEmissor" name="OrgaoEmissor"
					value=""></td>

			</tr>

			<tr>
				<td>rg</td>
				<td><input type="text" id="idRg" name="Rg" value=""></td>

			</tr>

			<tr>
				<td>dtNascimento</td>
				<td><input type="text" id="idDtNascimento" name="DtNascimento"
					value=""></td>

			</tr>

			<tr>
				<td>email</td>
				<td><input type="text" id="idEmail" name="Email" value=""></td>

			</tr>

			<tr>
				<td>bairro</td>
				<td><input type="text" id="idBairro" name="Bairro" value=""></td>

			</tr>

			<tr>
				<td>cep</td>
				<td><input type="text" id="idCep" name="Cep" value=""></td>

			</tr>

			<tr>
				<td>cidade</td>
				<td><input type="text" id="idCidade" name="Cidade" value=""></td>

			</tr>

			<tr>
				<td>complemento</td>
				<td><input type="text" id="idComplemento" name="Complemento"
					value=""></td>

			</tr>

			<tr>
				<td>logradouro</td>
				<td><input type="text" id="idLogradouro" name="Logradouro"
					value=""></td>

			</tr>

			<tr>
				<td>numero</td>
				<td><input type="text" id="idNumero" name="Numero" value=""></td>

			</tr>

			<tr>
				<td>uf</td>
				<td><input type="text" id="idUf" name="Uf" value=""></td>

			</tr>

			<tr>
				<td>nome</td>
				<td><input type="text" id="idNome" name="Nome" value=""></td>

			</tr>

			<tr>
				<td>senha</td>
				<td><input type="text" id="idSenha" name="Senha" value=""></td>

			</tr>

			<tr>
				<td>sexo</td>
				<td><input type="text" id="idSexo" name="Sexo" value=""></td>

			</tr>

			<tr>
				<td>ddd</td>
				<td><input type="text" id="idDdd" name="Ddd" value=""></td>

			</tr>

			<tr>
				<td>ddi</td>
				<td><input type="text" id="idDdi" name="Ddi" value=""></td>

			</tr>

			<tr>
				<td>numeroTel</td>
				<td><input type="text" id="idNumeroTel" name="NumeroTel"
					value=""></td>

			</tr>

			<tr>
				<td>ramal</td>
				<td><input type="text" id="idRamal" name="Ramal" value=""></td>

			</tr>

			<tr>
				<td>tipoRC</td>
				<td><input type="text" id="idTipoRc" name="TipoRc" value=""></td>

			</tr>

			<tr>
				<td>tipoTel</td>
				<td><input type="text" id="idTipoTel" name="TipoTel" value=""></td>

			</tr>

		</table>

	</form>

</body>
</html>

<script type="text/javascript">
	$(document).ready(function() {

		//alert("Entrei no formulário !")

		//$("#idComplemento").val("casa 1");

		//alert($("#idComplemento").val());

	});

	$.ajax({

		type : "GET",
		url : "http://localhost:9080/AluguelCarro/aluguelRest/cliente/4",
		cache : false,
		async : false,
		dataType : "json",
		success : function(resultCliente) {
			
			$("#idCodigo").val(resultCliente.pessoaFisica.codigo);
			$("#idCpf").val(resultCliente.documentoPessoaFisica.cpf);
			$("#idDtEmissaoRG").val(resultCliente.documentoPessoaFisica.dtEmissaoRG);
			$("#idHabilitacao").val(resultCliente.documentoPessoaFisica.habilitacao);
			$("#idOrgaoEmissor").val(resultCliente.documentoPessoaFisica.orgaoEmissor);
			$("#idRg").val(resultCliente.documentoPessoaFisica.rg);
			$("#idDtNascimento").val(resultCliente.documentoPessoaFisica.dtNascimento);
		    $("#idDtNascimento").val(resultCliente.documentoPessoaFisica.dtNascimento);
		    $("#idEmail").val(resultCliente.documentoPessoaFisica.email);
		    $("#idBairro").val(resultCliente.endereco.bairro);
		    $("#idCep").val(resultCliente.endereco.cep);
		    $("#idCidade").val(resultCliente.endereco.cidade);
		    $("#idComplemento").val(resultCliente.endereco.complemento);
			
						
		}

	});
</script>
