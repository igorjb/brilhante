package br.com.devmedia.javaoo;

public class UsandoListaJava 
{
	public static void main(String[] args) 
	{
		String nome[] = new String[20];
		int idade[] = new int[10];
		
		nome[0] = "Olá";
		idade[9] = 15;
		
		String aux = nome[3];
		int result = idade[0]+idade[9];
		
		System.out.println("Resultado: " + result);

	}

}
