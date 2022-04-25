package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pcaborno.Colaborador;
import util.ConnectionUtil;

public class ColaboradorDao {
	
	private static ColaboradorDao instance;
	private List<Colaborador> listaColaborador = new Arraylist<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static ColaboradorDao getInstance() {
		if (instance == null) {
			instance = new ColaboradorDao();
		}
		return instance;
	}
	
public void salvar(Colaborador colaborador) {
	try {
		String sql = "insert into cliente (colaborador, cpf, cnh) values (?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, colaborador.getColaborador());
		pstmt.setString(2, colaborador.getCpf());
		pstmt.setString(3, colaborador.getCnh());
		pstmt.execute();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

	public void atualizar(Colaborador colaborador) {
		try {
			String sql = "update colaborador set Colaborador = ?, cpf = ?, cnh = ?, where idcolaborador = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, colaborador.getColaborador());
			pstmt.setString(2, colaborador.getCpf());
			pstmt.setString(3, colaborador.getCnh());
			pstmt.setInt(4, colaborador.getIdcolaborador());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int idcolaborador) {
		try {
			String sql = "delete from cliente where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idcolaborador);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Colaborador> listar(){
		List<Colaborador> listaColaborador = new ArrayList<>();
		try {
			String sql = "select * from Colaborador";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Colaborador c = new Colaborador();
				c.setIdcolaborador(rs.getInt("id"));
				c.setColaborador(rs.getString("Colaborador"));
				c.setCpf(rs.getString("cpf"));
				c.setCnh(rs.getString("cnh"));
			
				listaColaborador.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaColaborador;
	}

}
