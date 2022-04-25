package Pcaborno;

import java.time.LocalDate;
import java.util.List;

public class Chamados {
		
		private LocalDate dataEmissao;
		private Double distanciaTotal;
		private Colaborador colaborador;
		private List<ChamadosA> chamadosA;
		
		public Chamados(LocalDate dataEmissao, Colaborador colaborador) {
			this.dataEmissao = dataEmissao;
			this.colaborador = colaborador;
		}

		public Chamados () {
		}
		
		public LocalDate getDataEmissao() {
			return dataEmissao;
		}
		public void setDataEmissao(LocalDate dataEmissao) {
			this.dataEmissao = dataEmissao;
		}
		
		public Double getDistanciaTotal() {
			return distanciaTotal;
		}
		public void setDistanciaTotal(Double distanciaTotal) {
			this.distanciaTotal = distanciaTotal;
		}
		public Colaborador getColaborador() {
			return colaborador;
		}
		public void setColaborador(Colaborador colaborador) {
			this.colaborador = colaborador;
		}
		public List<ChamadosA> getChamadosA() {
			return chamadosA;
		}
		public void setChamadosA (List<ChamadosA> chamadosA) {
			this.chamadosA = chamadosA;
		}
}
		
