package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class leapYearCheck {
    public static void main(String[] args) {
        leapYear();
    }

    public static void leapYear (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter YEAR: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)) {
            System.out.println(year + " Leap Year!");

        }else {
            System.out.println(year + " not a Leap year!");
        }


    }
}




//11) Verificação de Ano Bissexto:
//Faça um programa que receba um ano e verifique se ele é bissexto ou não.
