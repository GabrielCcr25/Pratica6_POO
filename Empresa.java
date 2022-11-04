package br.com.newton.Questao2;

import javax.swing.*;

public class Empresa {
   private String nome;
   private String cnpj;
   private int qntFunc;
     Funcionario [] funcionarios;

    public Empresa(String nome, String cnpj, int qntFunc, Funcionario[] funcionarios) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qntFunc = qntFunc;
        this.funcionarios = funcionarios;
        if (qntFunc<=100){
            this.qntFunc = qntFunc;
            funcionarios= new Funcionario[qntFunc];
        }
        else{
            this.qntFunc = qntFunc;
            funcionarios = new Funcionario[100];
        }



    }

    }


