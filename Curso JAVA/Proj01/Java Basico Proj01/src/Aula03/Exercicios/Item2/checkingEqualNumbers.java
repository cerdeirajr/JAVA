package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class checkingEqualNumbers {
    public static void main(String[] args) {
equalNumber();
    }

    public static void equalNumber(){
        Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter the first integer:  ");
        int numberA = scanner.nextInt();

            System.out.print(" Entries with the Second integer: ");
        int numberB = scanner.nextInt();

        if (numberA == numberB){
            System.out.println(" The numbers are EQUAL!");
        }else {
            System.out.println(" The numbers are DIFFERENT ");
        }


    }
}



//7) Verificação de Números Iguais:
//Faça um programa que leia dois números inteiros e exiba se eles são iguais ou diferentes.