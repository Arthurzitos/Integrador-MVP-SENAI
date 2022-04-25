package Pcaborno;

public class ChamadosA {

	private int qtde;
	private Veiculo veiculo;
	private Double distanciaTotal;
	
	public ChamadosA(int qtde, Veiculo veiculo) {
		this.qtde = qtde;
		this.veiculo = veiculo;
		if (veiculo != null && this.qtde > 0) {
			calcularDistanciaTotal();
		}
	}
	public ChamadosA() {
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public Veiculo Veiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public Double getDistanciaTotal() {
		return distanciaTotal;
	}
	public void setDistanciaTotal(Double distanciaTotal) {
		this.distanciaTotal = distanciaTotal;
	}
	public void calcularDistanciaTotal() {
		this.distanciaTotal = qtde * distanciaTotal.getKm();
	}
}
