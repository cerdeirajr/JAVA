package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class ratingEvenorOdd {
    public static void main(String[] args) {
        number();
    }

    public static void number (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number:  ");

        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println( "The number entered" + "  " + number + "  " + "Is even !");
        }else {
            System.out.println("O The number entered" + "  " + number + "  " + " Is odd! ");
        }

    }
}



// 2) Par ou Ímpar:
//Crie um programa que receba um número inteiro e verifique se ele é par ou ímpar.