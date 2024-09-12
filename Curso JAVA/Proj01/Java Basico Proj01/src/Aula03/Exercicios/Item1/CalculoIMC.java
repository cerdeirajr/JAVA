package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o peso em Kg:  ");
        double peso = scanner.nextDouble();

        System.out.print(" Entre com Altura em Metros:   ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.print("Seu IMC é de " + imc);

        if (imc <18.5) {
            System.out.println("Abaixo do peso!");
        } else if (imc < 24.9) {
            System.out.println(" Peso normal!");

        } else if (imc < 29.9) {
            System.out.println(" Esta com sobre peso!");

        }else {
            System.out.println("Esta com Obesidade");
        }


    }
}


//14) Calculo de IMC:
//Crie um programa que leia o peso e a altura de uma pessoa e calcule seu Índice de Massa Corporal (IMC).
// Classifique o resultado como "Abaixo do peso", "Peso normal", "Sobrepeso" ou "Obesidade".