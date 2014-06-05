package br.com.devmedia.javaoo;

import javax.swing.JOptionPane;

public class UsandoModeloOO 
{
	public static void main(String[] args) 
	{
		//entrada
		
		String texto = JOptionPane.showInputDialog(null, "Digite um texto ");
		String saida = "";
		
		//processamento
		
		for (int i = 0; i < texto.length(); i++)
		{
			char letra = texto.charAt(i);
			int ascii = (int) letra;
			int novaLetraAsc = ascii - 32;
			char novaLetra = (char) novaLetraAsc;
			
			saida = saida + novaLetra;
		}
		
		//saída

		JOptionPane.showMessageDialog(null, "Resposta: " + saida);
		
	}

}
