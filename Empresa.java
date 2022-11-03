package br.com.Questao2;

public class Empresa {
	String nome;
	String cnpj;
	int qntFunc;
	
	int[] qntFuncionario = new int[100];

	public Empresa(String nome, String cnpj, int qntFunc, int[] qntFuncionario) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.qntFunc = qntFunc;
		this.qntFuncionario = qntFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public int getQntFunc() {
		return qntFunc;
	}

	public void setQntFunc(int qntFunc) {
		this.qntFunc = qntFunc;
	}

	public int[] getQntFuncionario() {
		return qntFuncionario;
	}

	public void setQntFuncionario(int[] qntFuncionario) {
		this.qntFuncionario = qntFuncionario;
	}
	
	
	
	

}
