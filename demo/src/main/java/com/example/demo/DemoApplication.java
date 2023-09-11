package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

import com.example.demo.pessoas.Funcionario;
import com.example.demo.pessoas.Atendente;
import com.example.demo.pessoas.Supervisor;
import com.example.demo.pessoas.Gerente;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = null; // Para armazenar o funcionário cadastrado

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Funcionario");
            System.out.println("2. Calcular Salário, Tributos, 13º e Férias");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de nova linha

            switch (opcao) {
                case 1:
                    // Opção para cadastrar funcionário
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a idade do funcionário: ");
                    int idade = scanner.nextInt();
                    System.out.print("Digite o salário base do funcionário: ");
                    double salarioBase = scanner.nextDouble();

                    System.out.println("Escolha a função do funcionário:");
                    System.out.println("1. Atendente");
                    System.out.println("2. Supervisor");
                    System.out.println("3. Gerente");
                    int escolhaFuncao = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de nova linha

                    switch (escolhaFuncao) {
                        case 1:
                            funcionario = new Atendente(nome, idade, salarioBase);
                            break;
                        case 2:
                            funcionario = new Supervisor(nome, idade, salarioBase);
                            break;
                        case 3:
                            funcionario = new Gerente(nome, idade, salarioBase);
                            break;
                        default:
                            System.out.println("Opção de função inválida.");
                            break;
                    }

                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    // Opção para calcular Salário, Tributos, 13º e Férias
                    if (funcionario != null) {
                        double salario = funcionario.calcularSalario();
                        double fgts = funcionario.calcularFGTS();
                        double inss = funcionario.calcularINSS();
                        double decimoTerceiro = funcionario.calcularDecimoTerceiro();
                        double ferias = funcionario.calcularFerias();

                        System.out.println("\nResultados dos cálculos:");
                        System.out.println("Salário: " + salario);
                        System.out.println("FGTS: " + fgts);
                        System.out.println("INSS: " + inss);
                        System.out.println("13º (Décimo Terceiro): " + decimoTerceiro);
                        System.out.println("Férias: " + ferias);
                    } else {
                        System.out.println("Por favor, cadastre um funcionário primeiro.");
                    }
                    break;

                case 3:
                    // Opção para sair do programa
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
