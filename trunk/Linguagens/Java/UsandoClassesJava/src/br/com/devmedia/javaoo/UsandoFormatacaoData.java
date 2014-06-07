package br.com.devmedia.javaoo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class UsandoFormatacaoData 
{
	public static void main(String[] args) 
	{
		//entrada
		
		String data = JOptionPane.showInputDialog(null, "Digite uma data (dd/mm/aaaa)");
		
		//processamento
		try 
		{
			Date dataInform = new Date();
			dataInform = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			
			//saída

			JOptionPane.showMessageDialog(null, new SimpleDateFormat("EEEE, dd' de 'MMMMM' de 'yyyy").format(dataInform));
			
		} catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "Erro no formato da data!!!!");
		}

	}

}