$(document).ready(function(){
		function alterarFontClass() {
			$("font").attr("id", "linksVermelhos");
		}
		
		$("button").on("click", function(event) {
			alterarFontClass();
		});
});