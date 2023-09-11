package com.example.demo.pessoas;

import com.example.demo.enuns.Funcao;

public class Atendente extends Funcionario {

    public Atendente(String nome, int idade, double salarioBase) {
        super(nome, idade, Funcao.ATENDENTE, salarioBase);
    }

    @Override
    public double calcularSalario() {
        // Implemente o cálculo do salário para Atendente
        return getSalarioBase(); // Salário mensal fixo
    }

    @Override
    public double calcularFGTS() {
        // Implemente o cálculo do FGTS para Atendente
        return getSalarioBase() * 0.08; // 8% do salário mensal
    }

    @Override
    public double calcularINSS() {
        // Implemente o cálculo do INSS para Atendente
        return getSalarioBase() * 0.10; // 10% do salário mensal
    }

    @Override
    public double calcularDecimoTerceiro() {
        // Implemente o cálculo do 13º para Atendente
        return getSalarioBase(); // 13º igual ao salário mensal
    }

    @Override
    public double calcularFerias() {
        // Implemente o cálculo de férias para Atendente
        return getSalarioBase() / 3.0; // 1/3 de acréscimo no salário para férias
    }
}
