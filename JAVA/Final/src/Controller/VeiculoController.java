package Controller;

import java.util.List;


import Pcaborno.Veiculo;
import dao.VeiculoDao;

public class Veiculo {

	public void salvar(Veiculo veiculo) throws Exception{
			if(veiculo.getveiculo() == null || veiculo.getveiculo().length() < 3) {
				throw new Exception("Veiculo Inválido");
			}
		VeiculoDao.getInstance().salvar(veiculo);
		}

	public void atualizar(Veiculo veiculo) throws Exception{
		if(veiculo.getveiculo() == null || veiculo.getveiculo().length() < 3) {
			throw new Exception("Veiculo Inválido");
		}
		VeiculoDao.getInstance().atualizar(veiculo);
	}	
	
	public void excluir(int idveiculo) throws Exception{
		if (idveiculo == 0) {
			throw new Exception("Nenhum Veiculo Selecionado");
		}
	VeiculoDao.getInstance().excluir(idveiculo);
	}
	
	public List<Veiculo> listar(){
		return VeiculoDao.getInstance().listar();
	}
}

