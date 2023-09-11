package com.example.demo.pessoas;

import com.example.demo.enuns.Funcao;
import com.example.demo.interfaces.*;

public abstract class Funcionario implements CalculoSalario, CalculoFGTS, CalculoINSS, CalculoDecimoTerceiro, CalculoFerias {
    private String nome;
    private int idade;
    private Funcao funcao;
    private double salarioBase;

    public Funcionario(String nome, int idade, Funcao funcao, double salarioBase) {
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
