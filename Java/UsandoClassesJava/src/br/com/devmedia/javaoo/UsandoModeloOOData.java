package br.com.devmedia.javaoo;

import javax.swing.JOptionPane;

public class UsandoModeloOOData 
{
	public static void main(String[] args) 
	{
		//entrada
		
		String data = JOptionPane.showInputDialog(null, "Digite uma data (dd/mm/aaaa)");
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
						  "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		//processamento
		
		String parte[] = data.split("/");
		int mes = Integer.parseInt(parte[1]);
		String mesExtenso = meses[mes - 1];
		
		//saída

		JOptionPane.showMessageDialog(null, parte[0] + " de " + mesExtenso + " de " + parte[2]);
		
	}

}
