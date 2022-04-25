package Controller;

import dao.ChamadosDao;
import Pcaborno.Chamados;

public class ChamadosController {

	public void registrarChamados (Chamados chamados) throws Exception {
		if (chamados.getDataEmissao() == null) {
			throw new Exception("Data Inv�lida");
		}
		if (chamados.getColaborador() == null) {
			throw new Exception("Colaborador Inv�lido");
		}
		ChamadosDao.getInstance().registrarChamados(chamados);
	} 
}