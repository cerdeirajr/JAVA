package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class conversaoHarasMinutos {
    public static void main(String[] args) {

        Scanner scnner =  new Scanner(System.in);
        System.out.print("entre com as Horas:  ");
        double horas = scnner.nextDouble();

        if (horas < 0 ) {
            System.out.println("Erro: o valor informado não pode ser negativo.");
        }else {
            double minutos = horas * 60;
            System.out.println(horas + " horas equivalem a " + minutos + " minutos.");

        }

    }
}



//19) Conversão de Horas em Minutos:
//Crie um programa que leia um valor em horas e converta para minutos.
// Se o valor em horas for negativo, exiba uma mensagem de erro.