package br.com.devmedia;


import java.util.Scanner;


public class UsandoWhile {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int condicao = 0;
        
        do  {
              System.out.println("Digite 1 para sair");
              condicao = entrada.nextInt();
            
              System.out.println("Voc� digitou o n�mero " + condicao);
            
              System.out.println("Digite 1 para sair");
              condicao = entrada.nextInt();
            
        } while (condicao != 1);
        
        System.out.println("At� Logo");
        
        
        
                
    }
}
