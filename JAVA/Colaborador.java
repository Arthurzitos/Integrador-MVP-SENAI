package util;

public class Colaborador {

	private int ID;
	private String nome;
	private String cpf;
	private String cnh;
	
	public Colaborador (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	public Colaborador() {
}
	public int getID() {
		return ID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.setNome = nome;
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
		return nome + " Permissao CNH: " + cnh;
	}
}
