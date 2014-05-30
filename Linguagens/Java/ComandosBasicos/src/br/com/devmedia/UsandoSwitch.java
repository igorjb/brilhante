package br.com.devmedia;


import java.util.Scanner;


public class UsandoSwitch {

    public static void main(String[] args) {
        
        int continua = 0;
        
            while (continua == 0){

            //ENTRADA
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero de 0 a 9");
            int num = entrada.nextInt();
            String numeroExtenso = "";

            //PROCESSAMENTO
        switch (num) {
            case 0 : numeroExtenso = "zero";
                break;
            case 1 : numeroExtenso = "um";
                break;
            case 2 : numeroExtenso = "dois";
                break;
            case 3 : numeroExtenso = "tres";
                break;
            case 4 : numeroExtenso = "quatro";
                break;
            case 5 : numeroExtenso = "cinco";
                break;
            case 6 : numeroExtenso = "seis";
                break;
            case 7 : numeroExtenso = "sete";
                break;  
            case 8 : numeroExtenso = "oito";
                break;
            case 9 : numeroExtenso = "nove";
                break;
            default : numeroExtenso = "Valor não suportado";
                break;
        }
        
       //SAIDA
       System.out.println(numeroExtenso); 
        
       System.out.println("Digite 1 para sair ou 0 para continuar");
       continua = entrada.nextInt();
        
        
        
            }
    }
}
