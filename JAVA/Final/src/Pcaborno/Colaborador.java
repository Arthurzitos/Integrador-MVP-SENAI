package Pcaborno;

public class Colaborador {
	private int idcolaborador;
	private String colaborador;
	private String cpf;
	private String cnh;

	public Colaborador (String colaborador, String cpf) {
		this.colaborador = colaborador;
		this.cpf = cpf;
	}
	public Colaborador() {
}
	public int getIdcolaborador() {
		return idcolaborador;
	}
	public String getColaborador() {
		return colaborador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getcnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	
	public String toString(){
		return colaborador + " Permissao CNH: " + cnh;
	}
	public void setIdcolaborador(int i) {
		// TODO Auto-generated method stub
		
	}
	
}
