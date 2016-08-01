$(document).ready(function() {
	
	function deletarConvidado(convidado) {
		console.log(convidado);
		$.ajax({
			type: "POST",
			data: {convidado : convidado},
			url: "/deletar",
			contentType: 'application/json'
		});
	} 
});