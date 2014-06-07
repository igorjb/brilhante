package br.com.devmedia.javaoo;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class UsandoCalendar 
{
	public static void main(String[] args) 
	{
		Calendar agora = Calendar.getInstance();
		
		System.out.println("Dia: " + agora.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês: " + (agora.get(Calendar.MONTH) + 1));
		System.out.println("Ano: " + agora.get(Calendar.YEAR));
		
		System.out.println("Hora: " + agora.get(Calendar.HOUR_OF_DAY));
		System.out.println("Minuto: " + (agora.get(Calendar.MINUTE)));
		System.out.println("Segundo: " + agora.get(Calendar.SECOND));
		
		System.out.println("----------------------------------------");
		
		String dataInform = JOptionPane.showInputDialog(null, "Digite sua Data de Nascimento (dd/mm/aaaa):");
		String parte[] = dataInform.split("/");
		
		int dia = Integer.parseInt(parte[0]);
		int mes = Integer.parseInt(parte[1]);
		int ano = Integer.parseInt(parte[2]);
		
		Calendar nasc = Calendar.getInstance();
		nasc.set(Calendar.DAY_OF_MONTH, dia);
		nasc.set(Calendar.MONTH, (mes-1));
		nasc.set(Calendar.YEAR, ano);
		
		System.out.println("Dia Nasc: " + nasc.get(Calendar.DAY_OF_MONTH));
		System.out.println("Mês Nasc: " + (nasc.get(Calendar.MONTH) + 1));
		System.out.println("Ano Nasc: " + nasc.get(Calendar.YEAR));
		
		long tempoInMillis = nasc.getTimeInMillis();
		System.out.println(tempoInMillis);

	}
}
