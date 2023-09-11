package com.example.demo.pessoas;

import com.example.demo.enuns.Funcao;


public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, double salarioBase) {
        super(nome, idade, Funcao.SUPERVISOR, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para Supervisor
        return getSalarioBase() + 1500.0; // Exemplo de bônus fixo de 1500 unidades monetárias
    }

    @Override
    public double calcularFGTS() {
        // Implemente o cálculo do FGTS para Supervisor
        return getSalarioBase() * 0.08; // 8% do salário mensal
    }

    @Override
    public double calcularINSS() {
        // Implemente o cálculo do INSS para Supervisor
        return getSalarioBase() * 0.10; // 10% do salário mensal
    }

    @Override
    public double calcularDecimoTerceiro() {
        // Implemente o cálculo do 13º para Supervisor
        return getSalarioBase(); // 13º igual ao salário mensal
    }

    @Override
    public double calcularFerias() {
        // Implemente o cálculo de férias para Supervisor
        return getSalarioBase() / 3.0; // 1/3 de acréscimo no salário para férias
    }
}
