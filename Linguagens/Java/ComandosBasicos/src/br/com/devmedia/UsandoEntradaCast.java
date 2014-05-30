package br.com.devmedia;

import java.util.Scanner;

public class UsandoEntradaCast {

    
    public static void main(String[] args) {
        
        //entrada
        Scanner entrada = new Scanner( System.in);
        
        System.out.println( "Digite o ano de nascimento");        
        int anoNascimento = entrada.nextInt();
        System.out.println( "Digite o ano atual");
        int anoAtual = entrada.nextInt();
        
        System.out.println( "Digite o seu peso");
        double peso = entrada.nextDouble();
        
        System.out.println( "Digite a sua altura");
        double altura = entrada.nextDouble();
        
        //processamento
        int idade = anoAtual - anoNascimento;
        
        int imc = (int)(peso / (altura * altura) );
        
        double aux = imc;
        
        long aux1 = 7983729278389L;
        int aux2 = (int) aux1;
        aux1 = aux2;
        
        char letra = 'A';
        
        int ascii = (int) letra;   
        
        
        
        //saida
        System.out.println( "Idade " + idade);
        System.out.println("Ascii " + ascii);
        
    }
}
