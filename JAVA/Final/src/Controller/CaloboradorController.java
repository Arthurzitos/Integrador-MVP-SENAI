package Controller;

import java.util.List;

import dao.ColaboradorDao;
import Pcaborno.Colaborador;

public class CaloboradorController {

	public void salvar(Colaborador colaborador) throws Exception{
		if(colaborador.getColaborador() == null || colaborador.getColaborador().length() < 3) {
			throw new Exception("Colaborador Inválido");
		}
	ColaboradorDao.getInstance().salvar(colaborador);
	}
	
	public void atualizar(Colaborador colaborador) throws Exception{
		if(colaborador.getColaborador() == null || colaborador.getColaborador().length() < 3) {
			throw new Exception("Colaborador Inválido");
		}
	ColaboradorDao.getInstance().atualizar(colaborador);
	}	
	
	public void excluir(int idcolaborador) throws Exception{
		if (idcolaborador == 0) {
			throw new Exception("Nenhum Colaborador Selecionado");
		}
	ColaboradorDao.getInstance().excluir(idcolaborador);
	}
	
	public List<Colaborador> listar(){
		return ColaboradorDao.getInstance().listar();
	}
}
