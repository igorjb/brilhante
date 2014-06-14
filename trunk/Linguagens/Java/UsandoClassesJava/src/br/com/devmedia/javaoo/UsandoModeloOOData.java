package br.com.devmedia.javaoo;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

import javax.swing.JOptionPane;

public class UsandoModeloOOData 
{
	public static String getDataExtenso(String data) 
	{
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
				  "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

		String diasdaSemana[] = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", 
										"Quinta-Feira", "Sexta-Feira", "Sábado"};
			
		//processamento
			
		String parte[] = data.split("/");
		int dia = Integer.parseInt(parte[0]);
		int mes = Integer.parseInt(parte[1]);
		int ano = Integer.parseInt(parte[2]);
			
		Date date = new Date();
		date.setDate(dia);
		date.setMonth((mes - 1));
		date.setYear((ano - 1900));
			
		int diaDaSemana = date.getDay();
			
		String diaSemanaExtenso = diasdaSemana[diaDaSemana];
			
		String mesExtenso = meses[mes - 1];
			
		//saída
		return (diaSemanaExtenso + ", " + parte[0] + " de " + mesExtenso + " de " + parte[2]); 	
		
	}
	
	public static void main(String[] args) 
	{
		
		//entrada
		
		String data = JOptionPane.showInputDialog(null, "Digite uma data (dd/mm/aaaa)");
		
		//processamento
		
		String dataExtenso = getDataExtenso(data);
		
		//saída
		JOptionPane.showMessageDialog(null, dataExtenso);
	}

}
