package br.com.devmedia.javaoo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class UsandoListaJava {

   
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList();
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Joana");
        lista.add( "Jose");
        
        if (lista.contains ("Maria")) {
            System.out.println( "Achou ");            
        } else{
            System.out.println("Objeto não encontrado");
        }
        
        String elemento = lista.get( 0 );
        System.out.println(elemento);
        
        String ultimoElemento = lista.get( lista.size() -1 );
        System.out.println(ultimoElemento);
        
        //Retornando Valores de Uma Lista:
        
        //Pelo tamanho da lista
        
    	/*for (int i = 0; i < lista.size(); i++) 
		{
			String element = lista.get(i);
			System.out.println("Elemento = " + element);
		}*/
    	
        //Pelo Iterator
        
        Iterator<String> it = lista.iterator();
        
        while ( it.hasNext())
        {
            elemento = it.next();
            System.out.println( "Elemento " +elemento );
        }
    }
}
