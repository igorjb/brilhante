package br.com.triadworks.jdbc;

import java.sql.Connection;

public class TestandoConexaoJDBC {

	public static void main(String[] args) 
	{
		
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conectado, bem vindo ao Banco de Dados com Java!");
			connection.close();
		} catch (Exception e) {
			
		}
		
	}

}
