$(document).ready(function() {
	$("#labelDevendo").maskMoney();
	$("#labelData").inputmask("d/m/y");
	jQuery.validator.setDefaults({
		debug: true,
		sucess: "valid"
	});
	
	$("#formAdicionaCaloteiro").validate({
		rules: {
			nome: {
				required: true,
				maxlength: 45
			},
			email: {
				required: true,
				email:true
			}
		},
		
		messages:{
			nome: {
				required: "Esse campo � obrigat�rio",
				maxlength: "O campo nome n�o pode ter mais que 45 caracteres"
			},
			email: {
				required: "Esse campo � obrigat�rio",
				email: "Este n�o � um email v�lido!"
			}
		}
	});
});