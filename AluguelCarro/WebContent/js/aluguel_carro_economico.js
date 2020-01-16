$(document).ready(function() {

	alert("Entrei no formulário !");

});

$.ajax({
	type : "GET",
	url : "http://viacep.com.br/ws/21311282/json",
	cache : false,
	async : false,
	dataType : 'json',
	success : function(resultCarro) {

		var html = "<select id=tipoCarroCBX> "
		html += "<option value=''>Selecione</option";

		for (var i = 0; i < resultCarro.length; i++) {

			html += "<option value=" + resultCarro[i].codCarro + ">"
					+ resultCarro[i].modelo + "</option";

		}

		html += "</select> ";

		$("#idTipoCarro").html(html);

	}

});