package com.example.demo.interfaces;

import com.example.demo.pessoas.Funcionario;

public interface CalculoTributos {
        double calcularFGTS(Funcionario funcionario);
        double calcularINSS(Funcionario funcionario);
        double calcularDecimoTerceiro(Funcionario funcionario);
        double calcularFerias(Funcionario funcionario);
    }
    
