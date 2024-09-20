package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class primeNumberCheck {

    public static void main(String[] args) {
            NumberPrime();
    }

    public static void NumberPrime(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("not Prime.");
        } else {
            boolean prime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println("Number Prime!");
            } else {
                System.out.println("Not Prime!");
            }
        }


    }
}


/* 4) Verificação de Número Primo: ok
Faça um programa que receba um número inteiro positivo e verifique se ele é primo ou não.
        Se for primo, exiba "Número Primo"; caso contrário, exiba "Não é Primo".

  Ex. de 0 á 100: 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.*/

