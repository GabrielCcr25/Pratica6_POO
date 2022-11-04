package br.com.newton.Questao2;

public class Funcionario extends Pessoa{
    private String dp;
    private double salario;
    private String rg;
    private boolean naEmpresa;

    public Funcionario(String nome, String email, String numTelefone, String dp, double salario, String rg, boolean naEmpresa) {
        super(nome, email, numTelefone);
        this.dp = dp;
        this.salario = salario;
        this.rg = rg;
        this.naEmpresa = naEmpresa;
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

    public boolean isNaEmpresa() {
        return naEmpresa;
    }

    public void setNaEmpresa(boolean naEmpresa) {
        this.naEmpresa = naEmpresa;
    }
    public void bonificar(double bonus){
        this.salario +=bonus;
    }
    public void demitir(){
        this.naEmpresa = false;
    }
    public String mostrarDados(){
        return getNome()+"\n"+getNumTelefone()+"\n"+getEmail()+"\n"+getRg()+"\n"+isNaEmpresa();


    }

}
