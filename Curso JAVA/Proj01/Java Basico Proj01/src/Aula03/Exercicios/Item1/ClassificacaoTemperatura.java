package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class ClassificacaoTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Entre com a temperatura: ");

            double temperatura = scanner.nextDouble();

            if (temperatura <15){
                System.out.println("FRIO! ");
            } else if (temperatura >= 15 && temperatura <= 25) {

                System.out.println("Agradavel! ");
            }else {
                System.out.println("Quente! ");
            }

    }
}

//12) Classificação de Temperatura:
//Escreva um programa que leia uma temperatura em graus Celsius e exiba se está "Frio" (abaixo de 15°C),
// "Agradável" (entre 15°C e 25°C) ou "Quente" (acima de 25°C).