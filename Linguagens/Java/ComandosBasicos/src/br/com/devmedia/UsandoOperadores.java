package br.com.devmedia;

import java.util.Scanner;


public class UsandoOperadores {
    
    public static void main (String args[]){
        
        //entrada
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println("Informe o primeiro numero: ");
    	double num1 = entrada.nextDouble();
    	
    	System.out.println("Informe o segundo numero: ");
    	double num2 = entrada.nextDouble();
        
        System.out.println("Informe a altura: ");
        double altura = entrada.nextDouble();
        
        System.out.println("Informe o peso: ");
        double peso = entrada.nextDouble();
        
        int contComando = 0;
        
        
        //processamento
        double divisao = num1 / num2;
        contComando--;
        
        double resto = divisao % 2;
        contComando--;
        
        double imc = peso / (altura * altura);
        contComando--;
        
        
        boolean abaixoPeso = imc < 25;
        boolean acimaPeso = imc >= 30;
        
        //saida
        System.out.println( "Divisao:  " + divisao );
        System.out.println( "Resto:  " + resto );
        System.out.println( "IMC:  " + imc );
        System.out.println( "Contador:  " + contComando );
        System.out.println( "Esta Magro:  " + abaixoPeso );
        System.out.println( "Esta Forte:  " + acimaPeso );
        
    }
    
}
