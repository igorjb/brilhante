package br.com.devmedia;

import java.util.Scanner;

public class UsandoIf {

  
    public static void main(String[] args) {
        
        //ENTRADA
        Scanner entrada = new Scanner (System.in);
        System.out.println( "Digite seu consumo em KW:" );
        //double valorKW = 0.72;
        int consumoKW = entrada.nextInt();
        double valorPago = 0;
        
        // < 10 ==> 0.50
        // >= 10 e <= 100 ==> 0.72
        // >= 100 ==> 1.00
       
        //&& --> operador logico E (AND)
        //|| --> operador logico OU (OR)
        
        System.out.println("O consumo em KW e: " + consumoKW);
        //PROCESSAMENTO
        if (consumoKW == 0){
             System.out.println( "Você não consumiu energia este mês" );
             //valorPago = consumoKW * valorKW;
             
        }else if (consumoKW < 0 || consumoKW > 1000){
             System.out.println( "Erro!!! valor não pode ser negativo e nem maiores de 1000" );  
             
        }else if (consumoKW > 0 && consumoKW < 10){            
            valorPago = consumoKW * 0.5;
        }   
        else if (consumoKW >= 10 && consumoKW < 100){        
            valorPago = consumoKW * 0.72;            
        }
        else if (consumoKW >=100){        
            valorPago = consumoKW * 1;
        }
        
                 
        
        
        //SAIDA
        System.out.println("Valor consumido: R$ " + valorPago);
    }
}
