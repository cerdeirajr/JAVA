package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        division();

    }

    public static void division(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");

        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println(number + " it is divisible by 3 and 5.");
        } else {
            System.out.println(number + " it is not divisible by 3 and 5.");
        }

    }
}


//17) Verificação de Divisibilidade:
//Crie um programa que leia um número e verifique se ele é divisível por 3 e por 5 ao mesmo tempo.