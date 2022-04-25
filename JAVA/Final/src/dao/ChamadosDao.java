package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Pcaborno.Chamados;
import Pcaborno.ChamadosA;
import Pcaborno.Veiculo;
import Pcaborno.ConnectionUtil;

public class ChamadosDao {
	
	private static ChamadosDao instance;
	private List<Chamados > listaChamados = new ArrayList<>();
	private Connection con = ConnectionUtil.getConnection();
	
	public static ChamadosDao getInstance() {
		if (instance == null) {
			instance = new ChamadosDao();
		}
		return instance;
	}

public void registrarChamados (Chamados chamados) {
	try {
		
		String sql = "insert into Chamados (dataEmissao, DistanciaTotal, idcolaborador) values (?, ?, ?)"; 
		
		PreparedStatement pstmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		
		pstmt.setDate(1, java.sql.Date.valueOf(chamados.getDataEmissao()));
		pstmt.setDouble(2, chamados.getDistanciaTotal());
		pstmt.setInt(3, chamados.getColaborador().getIdcolaborador());
		
		int key = pstmt.executeUpdate();

	if (key > 0) {
		
		ResultSet rs = pstmt.getGeneratedKeys();
		rs.next();
		int idChamados = rs.getInt(1);
	
		
		String sqlChamadosA = "insert into item_venda (qtde, valor_total, id_produto, id_venda) values (?, ?, ?, ?)";
		PreparedStatement pstmtChamadosA = con.prepareStatement(sqlChamadosA);
		for (ChamadosA item : chamados.getChamadosA()) {
			pstmtChamadosA.setInt(1, item.getQtde());
			pstmtChamadosA.setDouble(2, item.getDistanciaTotal());
			pstmtChamadosA.setInt(3, item.getVeiculo().getIdcolaborador());
			pstmtChamadosA.setInt(4, idChamados);
			pstmtChamadosA.execute();
		}
	}
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
}
}
