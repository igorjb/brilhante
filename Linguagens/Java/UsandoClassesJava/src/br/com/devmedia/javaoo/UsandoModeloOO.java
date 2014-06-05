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
		
		saida = texto.toUpperCase();
		
		//saída

		JOptionPane.showMessageDialog(null, "Resposta: " + saida);
		
	}

}
