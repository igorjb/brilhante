package br.com.devmedia.javaoo;

import java.util.Enumeration;
import java.util.Hashtable;

public class UsandoListaJava 
{   
    public static void main(String[] args) 
    {
    	//Pesquisando valores de uma lista
    	
    	//Pelo Hashtable
        Hashtable<String, String> lista = new Hashtable<String, String>();
        lista.put("joao", "joao;Rua das Flores;123;Curitiba;PR");
        lista.put("maria", "maria;Rua das Americas;123456;Florianopolis;SC");
        
        String elemento = lista.get("maria");
        System.out.println(elemento);
        
        //Percorrendo valores de uma lista
        
        //Pelo Enumeration
        
        //Retornando Elementos
        
        //Enumeration<String> en = lista.elements();
        
        //Retornando Chaves
        Enumeration<String> en = lista.keys();
        
        while (en.hasMoreElements()) 
        {
			elemento = en.nextElement();
			System.out.println(elemento);
		}
    }
}
