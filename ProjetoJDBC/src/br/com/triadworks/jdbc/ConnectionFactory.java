package br.com.triadworks.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory 
{
	public Connection getConnection() 
	{
		try 
		{
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/3WJavaWeb", "root", "root");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
}
