package br.com.devmedia;


public class UsandoOperadores {
    
    public static void main (String args[]){
        
        //entrada
        double num1 = 15;
        double num2 = 20;
        
        double inform = 5;
        
        double altura = 1.7;
        double peso = 180;
        
        int contComando = 0;
        
        
        //processamento
        double resultado = num1 + num2;
        contComando--;
        
        double resto = inform % 2;
        contComando--;
        
        double imc = peso / (altura * altura);
        contComando--;
        
        boolean abaixoPeso = imc < 25;
        boolean acimaPeso = imc >= 30;
        
        //saida
        System.out.println( "Resultado:  " + resultado );
        System.out.println( "Resultado:  " + resto );
        System.out.println( "IMC:  " + imc );
        System.out.println( "Contador:  " + contComando );
        System.out.println( "Esta magro:  " + abaixoPeso );
        System.out.println( "Esta forte:  " + acimaPeso );
    }
    
}
