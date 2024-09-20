package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class CalculationIMC {
    public static void main(String[] args) {

        calculation();

    }

    public static void calculation(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in Kg:  ");
        double weight = scanner.nextDouble();

        System.out.print(" Enter height in meters:  ");
        double height = scanner.nextDouble();

        double imc = weight / (height * height);
        System.out.print("Your IMC is " + imc);

        if (imc <18.5) {
            System.out.println("Underweight!");
        } else if (imc < 24.9) {
            System.out.println(" Normal weight!");

        } else if (imc < 29.9) {
            System.out.println(" You are overweight!");

        }else {
            System.out.println("You are obese!");
        }


    }
}


//14) Calculo de IMC:
//Crie um programa que leia o peso e a altura de uma pessoa e calcule seu Índice de Massa Corporal (IMC).
// Classifique o resultado como "Abaixo do peso", "Peso normal", "Sobrepeso" ou "Obesidade".