function alterarFontClass(){
	$("font").attr("class", "linksVermelhos");
}

$("button").on("click", function(event){
	alterarFontClass();
}
);