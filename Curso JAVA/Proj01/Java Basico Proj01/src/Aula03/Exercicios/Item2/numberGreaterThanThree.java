package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class numberGreaterThanThree {
    public static void main(String[] args) {
        numberGreater();

    }

    public static void numberGreater (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Whole Number:  ");
        int number1 = scanner.nextInt();

        System.out.print(" Enter the Second Whole Number:  ");
        int number2 = scanner.nextInt();

        System.out.print(" Enter the Third Whole Number: ");
        int number3 = scanner.nextInt();

        int largestNumber = number1;

        if (number2 > largestNumber) {
            largestNumber = number2;

        }

        if (number3 > largestNumber){
            largestNumber = number3;
        }

        System.out.println(" Among the numbers " + " - " + number1 + " - " + number2 + " - " + number3 + " - " + " The largest number is: " + largestNumber);

    }
}




// 4)Maior de Três Números:
//Escreva um programa que receba três números inteiros e determine qual deles é o maior.