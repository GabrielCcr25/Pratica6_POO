package br.com.Questao2;

public class Funcionario extends Pessoa {
	private String dp;
	private double salario;
	private String rg;
	private boolean situacaoFunc;
	public Funcionario(String nome, String email, String numTelefone, String dp, double salario, String rg,
			boolean situacaoFunc) {
		super(nome, email, numTelefone);
		this.dp = dp;
		this.salario = salario;
		this.rg = rg;
		this.situacaoFunc = situacaoFunc;
	}
	public String getDp() {
		return dp;
	}
	public void setDp(String dp) {
		this.dp = dp;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public boolean isSituacaoFunc() {
		return situacaoFunc;
	}
	public void setSituacaoFunc(boolean situacaoFunc) {
		this.situacaoFunc = situacaoFunc;
	}
	public 
	
	
	

}
