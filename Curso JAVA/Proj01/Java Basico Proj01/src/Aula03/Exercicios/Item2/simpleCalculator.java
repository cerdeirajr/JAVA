package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class simpleCalculator {


    public static void main(String[] args) {

        simpleCalculator();

    }

    public static void simpleCalculator() {


        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Solicita o operador
        System.out.print("Enter operator (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Solicita o segundo número
        System.out.print("Enter the second number:");
        double number2 = scanner.nextDouble();


        // Variável para armazenar o resultado
        double result;

        // Verifica o operador e realiza a operação correspondente
        switch (operador) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                    result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                // Verifica se o divisor não é zero
                if (number2!= 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // Caso o operador seja inválido
                System.out.println("Error: Invalid operator.");
                break;
        }


    }
}


// 15) Calculadora Simples:
//Escreva um programa que receba dois números e um operador (+, -, *, /) e realize a operação correspondente.
//Se o operador for inválido, exiba uma mensagem de erro.

