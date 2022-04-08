//Veiculo Controller
package controller;

import java.util.List;

import dao.VeiculoDao;
import util.Veiculo;

public class VeiculoController {

	public void salvar(Veiculo veiculo) throws Exception {
		if (veiculo.getDescricao() == null || veiculo.getDescricao().trim().equals("")) {
			throw new Exception("Descriçăo do veiculo inválida");
		}
		ProdutoDao.getInstance().salvar(veiculo);
	}
	
	public void atualizar(Veiculo veiculo) throws Exception {
		if (veiculo.getDescricao() == null || veiculo.getDescricao().trim().equals("")) {
			throw new Exception("Descriçăo do veiculo inválida");
		}
		VeiculoDao.getInstance().atualizar(veiculo);
	}
	
	public void excluir(int ID_veiculo) throws Exception {
		if (ID_veiculo == 0) {
			throw new Exception("Nenhum veiculo selecionado");
		}
		VeiculoDao.getInstance().excluir(ID_veiculo);
	}
	
	public List<Veiculo> listar(){
		return VeiculoDao.getInstance().listar();
	}
	
}