package Pcaborno;

public class Veiculo {

	private int idveiculo;
	private String veiculo;
	
	public Veiculo(String veiculo, String quilometragem, String consumo) {
		this.veiculo = veiculo;
	}
	public Veiculo() {
	}
	public int getID() {
		return idveiculo;
	}
	public String getveiculo() {
		return veiculo;
	}

}
