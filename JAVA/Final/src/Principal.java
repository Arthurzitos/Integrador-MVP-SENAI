import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import Controller.CaloboradorController;
import controller.ColaboradorController;
import controller.VeiculoController;
import controller.ChamadosController;
import Pcarbono.Colaborador;
import Pcarbono.ChamadosA;
import Pcarbono.Veiculo;
import Pcarbono.Chamados;

public class Principal {

	public static void main(String[] args) {

	}

	public static void testeColaborador() {
		
		Colaborador c1 = new Colaborador;
		c1.setIdColaborador(1);
		c1.setColaborador("JOAO PAULO");
		c1.setCpf("123456789");
		c1.setCnh("Permissão");
		Colaborador c2 = new Colaborador;
		c2.setIdColaborador(1);
		c2.setColaborador("JOAO PAULO");
		c2.setCpf("123456789");
		c2.setCnh("Sem Permissão");
		
		ColaboradorController controller = new CaloboradorController();
		try {
			controller.salvar(c1);
			controller.salvar(c2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		for (Colaborador c : controller.listar()) {
			System.out.println(c.toString());
		}
}

	public static void testeVeiculo() {
		Veiculo p1 = new Veiculo();
		p1.setIdveiculo(1);
		p1.setDescricao("Carro Branco");
		p1.setkm(20000);

		Veiculo p2 = new Veiculo();
		p2.setIdveiculo(2);
		p2.setDescricao("Carro Preto");
		p2.setkm(25000);

		VeiculoController controller = new VeiculoController();

		try {
			controller.salvar(p1);
			controller.salvar(p2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Veiculo p : controller.listar()) {
			System.out.println(p.toString());
		}
	}

public static void testeChamados() {
		
		Veiculo p1 = new Veiculo();
		p1.setIdveiculo(1);
		p1.setDescricao("Carro Branco");
		p1.setkm(20000);
		
		Veiculo p2 = new Veiculo();
		p2.setIdveiculo(2);
		p2.setDescricao("Carro Preto");
		p2.setkm(25000);
		
		ChamadosA i1 = new ChamadosA();
		i1.setVeiculo(p1);
		i1.setQtde(2);
		i1.calcularDistanciaTotal();
				
		ChamadosA i2 = new ChamadosA();
		i2.setProduto(p2);
		i2.setQtde(1);
		i2.calcularChamadosA();
		
		List<ChamadosA> items = new ArrayList<>();
		items.add(i1);
		items.add(i2);
		
		for (ChamadosA item : items) {
			System.out.println(item.getQtde() + " - " + item.getVeiculo() + " - TOTAL: " + item.getDistanciaTotal());
		}	
		
		Colaborador c1 = new Colaborador;
		c1.setIdColaborador(1);
		c1.setColaborador("JOAO PAULO");
		c1.setCpf("123456789");
		c1.setCnh("Permissão");
		
		Chamados chamados = new Chamados();
		chamados.setChamadosA(items);
		chamados.setColaborador(c1);
		chamados.setDataEmissao(LocalDate.now());
		
		ChamadosController controller = new ChamadosController();
		try {
			controller.registrarVenda(chamados);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
