package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class identificationPositiveNegativeZero {
    public static void main(String[] args) {
        identifies();
    }

    public static void identifies (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for classification:   ");

        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("Negative Number!");
        } else if (numero > 0) {
            System.out.println("Positive Number! ");

        }else {
            System.out.println("Zero Number!");
        }


    }
}


//3) Positivo, Negativo ou Zero:
//Faça um programa que leia um número e verifique se ele é positivo, negativo ou zero.