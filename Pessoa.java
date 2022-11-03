package br.com.Questao2;

public class Pessoa {
	private String nome;
	private String email;
	private String numTelefone;
	public Pessoa(String nome, String email, String numTelefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.numTelefone = numTelefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTelefone() {
		return numTelefone;
	}
	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}
	
	
	
	
	

}
