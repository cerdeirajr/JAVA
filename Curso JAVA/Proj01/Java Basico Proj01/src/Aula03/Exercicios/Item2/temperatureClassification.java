package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class temperatureClassification {
    public static void main(String[] args) {
        temperatureCalss();
    }

        public static void temperatureCalss(){

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the temperature: ");

            double temperature = scanner.nextDouble();

            if (temperature <15){
                System.out.println("COLD! ");
            } else if (temperature >= 15 && temperature <= 25) {

                System.out.println("Pleasant! ");
            }else {
                System.out.println("Hot! ");
            }

    }
}

//12) Classificação de Temperatura:
//Escreva um programa que leia uma temperatura em graus Celsius e exiba se está "Frio" (abaixo de 15°C),
// "Agradável" (entre 15°C e 25°C) ou "Quente" (acima de 25°C).