package br.com.devmedia.javaoo;

import javax.swing.JOptionPane;

public class UsandoMinhaClasse 
{
	public static void main(String[] args) 
	{
		String resposta = "";
		
		//entrada
		String op = JOptionPane.showInputDialog(null, "Bhaskara(B) ou Fatorial(F)?");
		
		//processamento
		if (op.equals("B"))
		{
			double a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de a "));
			double b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de b "));
			double c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de c "));
			
			//String result = FuncoesMatematicas.getBascara(a, b, c);
			
			resposta = FuncoesMatematicas.getBascara(a, b, c);
			
			
		} 
		else if (op.equals("F"))
		{
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número para o fatorial"));
			
			int result = FuncoesMatematicas.getFatorial(num);
			
			resposta = String.valueOf(result);
		}
		
		//saída
		JOptionPane.showMessageDialog(null, "Resposta: " + resposta);

	}

}
