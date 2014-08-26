package br.com.triadworks.jsf.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.triadworks.jsf.modelo.Caloteiro;

public class CaloteiroDAO {

	private Connection conexao;
	public CaloteiroDAO() {
		
	}
	/*
	public CaloteiroDAO() 
	{
		this.conexao = new ConnectionFactory().getConnection();
	}
	*/
	public CaloteiroDAO(Connection conexao) 
	{
		this.conexao = conexao;
	}
	//Inserir Caloteiro
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
			pstmt.setFloat(3, caloteiro.getDevendo());
			//pstmt.setDate(4, new Date(caloteiro.getDataDivida().getTimeInMillis()));
			
			pstmt.execute();
			pstmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Listar Caloteiros
	public List<Caloteiro> getLista() 
	{
		try {
			PreparedStatement stmt = this.conexao.prepareStatement("select * from caloteiro order by nome");
			
		    List<Caloteiro> caloteiros = new ArrayList<Caloteiro>();
			Caloteiro caloteiro = null;
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) 
			{
				Long id = rs.getLong("id");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				float devendo = rs.getFloat("devendo");
				
				Calendar dataDivida = Calendar.getInstance();
				dataDivida.setTime(rs.getDate("dataDivida"));
				
				//criando o objeto caloteiro
				caloteiro = new Caloteiro();
				caloteiro.setId(id);
				caloteiro.setNome(nome);
				caloteiro.setEmail(email);
				caloteiro.setDevendo(devendo);
				caloteiro.setDataDivida(dataDivida);
				
				caloteiros.add(caloteiro);
				
			}
			rs.close();
			stmt.close();
			return caloteiros;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Lista caloteiro por id
	public List<Caloteiro> exibe(Caloteiro caloteiro) 
	{
		try {
			PreparedStatement stmt = this.conexao.prepareStatement("select * from caloteiro where id = ?");
			
		    List<Caloteiro> caloteiros = new ArrayList<Caloteiro>();
			stmt.setLong(1, caloteiro.getId());
			ResultSet rs = stmt.executeQuery();
		
			while (rs.next()) 
			{
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				float devendo = rs.getFloat("devendo");
				
				Calendar dataDivida = Calendar.getInstance();
				dataDivida.setTime(rs.getDate("dataDivida"));
				
				//criando o objeto caloteiro
				//caloteiro = new Caloteiro();
				
				caloteiro.setNome(nome);
				caloteiro.setEmail(email);
				caloteiro.setDevendo(devendo);
				caloteiro.setDataDivida(dataDivida);
				
				caloteiros.add(caloteiro);
				
			}
			rs.close();
			stmt.close();
			return caloteiros;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Quantidade de Registros
	public int contador()
	{
		String sql = "select count(*) As count from caloteiro";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.next();
			return rs.getInt("count");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//Alterar Caloteiro
	public void altera(Caloteiro caloteiro) 
	{
		String sql = "update caloteiro set nome=?, email=?," +
					 "devendo=?, dataDivida=? where id=?";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, caloteiro.getNome());
			stmt.setString(2, caloteiro.getEmail());
			stmt.setFloat(3, caloteiro.getDevendo());
			stmt.setDate(4, new Date(caloteiro.getDataDivida().getTimeInMillis()));
			stmt.setLong(5, caloteiro.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//Deleta Caloteiro
	public void deleta(Caloteiro caloteiro) 
	{
		String sql = "delete from caloteiro where id=?";
		
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setLong(1, caloteiro.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
