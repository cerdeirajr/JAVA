package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoNumerosIguais {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
            System.out.print(" Ente com o Primeiro numero inteiro:  ");
        int numeroA = scanner.nextInt();

            System.out.print(" Ente com o Segundo numero inteiro:  ");
        int numeroB = scanner.nextInt();

        if (numeroA == numeroB){
            System.out.println(" Os numeros são IGUAIS! ");
        }else {
            System.out.println(" Os numeros são DIFERENTES! ");
        }


    }
}



//7) Verificação de Números Iguais:
//Faça um programa que leia dois números inteiros e exiba se eles são iguais ou diferentes.