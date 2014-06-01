package br.com.devmedia;


import java.util.Scanner;


public class UsandoWhile {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int condicao = 0;
        
        do  {
              System.out.println("Digite 1 para sair");
              condicao = entrada.nextInt();
            
              System.out.println("Você digitou o número " + condicao);
            
              System.out.println("Digite 1 para sair");
              condicao = entrada.nextInt();
            
        } while (condicao != 1);
        
        System.out.println("Até Logo");
        
        
        
                
    }
}
