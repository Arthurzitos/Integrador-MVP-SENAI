package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pcarbono.Veiculo;
import util.ConnectionUtil;

import Pcaborno.Colaborador;
import Pcaborno.Veiculo;

public class VeiculoDao {
	
	private static VeiculoDao instance;
	private List<Veiculo> listaVeiculo = new Arraylist<>();
	private Connection con = ConnectionUtil.getConnection();
	public static VeiculoDao getInstance() {
		if (instance == null) {
			instance = new VeiculoDao();
		}
		return instance;
	}

	public void salvar(Veiculo veiculo) {
		try {
			String sql = "insert into veiculo (descricao, km) values (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, veiculo.getDescricao());
			pstmt.setDouble(2, veiculo.getKm());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void atualizar(Veiculo veiculo) {
		try {
			String sql = "update Veiculo set descricao = ?, km = ? where idveiculo = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, veiculo.getDescricao());
			pstmt.setDouble(2, veiculo.getKm());
			pstmt.setInt(3, veiculo.getIdveiculo());
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(int idveiculo) {
		try {
			String sql = "delete from Veiculo where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idveiculo);
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
	
	public List<Veiculo> listar(){
		List<Veiculo> listaVeiculo = new ArrayList<>();
		try {
			String sql = "select * from Veiculo";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Veiculo p = new Veiculo();
				p.setIdveiculo(rs.getInt("idveiculo"));
				p.setDescricao(rs.getString("descricao"));
				p.setKm(rs.getDouble("KM"));
				listaVeiculo.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaVeiculo;
	}

	

}
