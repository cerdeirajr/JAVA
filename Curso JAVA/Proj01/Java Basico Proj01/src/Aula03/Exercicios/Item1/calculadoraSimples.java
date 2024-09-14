package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();



        // Variável para armazenar o resultado
        double resultado;

        // Verifica o operador e realiza a operação correspondente
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                // Verifica se o divisor não é zero
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                // Caso o operador seja inválido
                System.out.println("Erro: Operador inválido.");
                break;
        }


    }
}

// 15) Calculadora Simples:
//Escreva um programa que receba dois números e um operador (+, -, *, /) e realize a operação correspondente.
//Se o operador for inválido, exiba uma mensagem de erro.

