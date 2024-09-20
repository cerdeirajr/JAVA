package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class SimpleInterestCalculator{
    public static void main(String[] args) {

        interestCalculation();

    }

    public static void interestCalculation () {

                 Scanner scanner = new Scanner(System.in);


                System.out.print("Enter the loan amount (in reais):");
                double LoanAmount = scanner.nextDouble();

                System.out.print("Enter the monthly interest rate (in %):");
                double monthlyInterestRate = scanner.nextDouble();

                System.out.print("Enter the number of months: ");
                int numberMonths = scanner.nextInt();

                double DecimalInterestRate = monthlyInterestRate / 100;

                double TotalAmount;
                if (DecimalInterestRate == 0) {
                    TotalAmount = LoanAmount;
                } else {
                    TotalAmount = LoanAmount * (1 + DecimalInterestRate * numberMonths);
                }

                System.out.printf("The total amount to be paid is: R$" +  " " + TotalAmount);


    }
}



// 18) Calculadora de Juros Simples:
//Escreva um programa que receba o valor de um empréstimo, a taxa de juros mensal e o número de meses.
// Calcule o valor total a ser pago. Se a taxa de juros for zero, exiba o valor do empréstimo sem alteração.