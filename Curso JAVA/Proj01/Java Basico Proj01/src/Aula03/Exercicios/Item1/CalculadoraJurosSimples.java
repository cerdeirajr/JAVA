package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class CalculadoraJurosSimples {
    public static void main(String[] args) {

                 Scanner scanner = new Scanner(System.in);


                System.out.print("Digite o valor do empréstimo (em reais): ");
                double valorEmprestimo = scanner.nextDouble();

                System.out.print("Digite a taxa de juros mensal (em %): ");
                double taxaJurosMensal = scanner.nextDouble();

                System.out.print("Digite o número de meses: ");
                int numeroMeses = scanner.nextInt();

                double taxaJurosDecimal = taxaJurosMensal / 100;

                double valorTotal;
                if (taxaJurosDecimal == 0) {
                    valorTotal = valorEmprestimo;
                } else {
                    valorTotal = valorEmprestimo * (1 + taxaJurosDecimal * numeroMeses);
                }

                System.out.printf("O valor total a ser pago é: R$" +  " " + valorTotal);


    }
}


// 18) Calculadora de Juros Simples:
//Escreva um programa que receba o valor de um empréstimo, a taxa de juros mensal e o número de meses.
// Calcule o valor total a ser pago. Se a taxa de juros for zero, exiba o valor do empréstimo sem alteração.