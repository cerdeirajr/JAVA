package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o numero: ");

        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println(numero + " é divisível por 3 e 5.");
        } else {
            System.out.println(numero + " não é divisível por 3 e 5.");
        }

    }
}


//17) Verificação de Divisibilidade:
//Crie um programa que leia um número e verifique se ele é divisível por 3 e por 5 ao mesmo tempo.