package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class harasMinutesConversion {
    public static void main(String[] args) {
conversion();

    }

    public static void conversion (){

        Scanner scnner =  new Scanner(System.in);
        System.out.print("Enter the hours:  ");
        double horas = scnner.nextDouble();

        if (horas < 0 ) {
            System.out.println("Error: the value entered cannot be negative.");
        }else {
            double minutes = horas * 60;
            System.out.println(horas + " Hours are equivalent to" + minutes + " minutes.");

        }

    }
}



//19) Conversão de Horas em Minutos:
//Crie um programa que leia um valor em horas e converta para minutos.
// Se o valor em horas for negativo, exiba uma mensagem de erro.