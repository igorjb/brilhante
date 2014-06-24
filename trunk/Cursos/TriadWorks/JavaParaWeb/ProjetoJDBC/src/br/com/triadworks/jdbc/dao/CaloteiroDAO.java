package br.com.triadworks.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.triadworks.jdbc.ConnectionFactory;
import br.com.triadworks.jdbc.modelo.Caloteiro;

public class CaloteiroDAO 
{
	private Connection conexao;
	
	public CaloteiroDAO () {
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	public void adiciona(Caloteiro caloteiro) 
	{
		String sql = "insert into caloteiro " + 
					 "(nome, email, devendo, dataDivida) " +
					 "values (?, ?, ?, ?)";
		
		try {
			//preparando a insercao
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			
			//setando os valores
			pstmt.setString(1, caloteiro.getNome());
			pstmt.setString(2, caloteiro.getEmail());
			pstmt.setInt(3, caloteiro.getDevendo());
			pstmt.setDate(4, new Date(caloteiro.getDataDivida().getTimeInMillis()));
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}
}
