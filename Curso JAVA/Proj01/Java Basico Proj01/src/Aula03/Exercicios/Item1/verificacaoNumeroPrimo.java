package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class verificacaoNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero positivo e inteiro: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("não é Primo.");
        } else {
            boolean primo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println("Numero Primo!");
            } else {
                System.out.println("Não é Primo!");
            }
        }


    }
}


/* 4) Verificação de Número Primo: ok
Faça um programa que receba um número inteiro positivo e verifique se ele é primo ou não.
        Se for primo, exiba "Número Primo"; caso contrário, exiba "Não é Primo".

  Ex. de 0 á 100: 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.*/

