package br.com.devmedia.util;

public class UtilErros {
	public static String getMenssagemErro(Exception e) {
		while (e.getCause() != null) {
			e = (Exception) e.getCause();
		}
		String retorno = e.getMessage();
		return retorno;
	}
}
