package br.com.triadworks.jsf.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public Connection getConnection() 
	{
		try 
		{
			DriverManager.registerDriver(new org.postgresql.Driver());
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/3WJavaWeb", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
