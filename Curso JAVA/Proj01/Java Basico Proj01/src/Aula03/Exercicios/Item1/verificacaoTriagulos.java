package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class verificacaoTriagulos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor do primeiro lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Qual o valor do segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Qual o valor do terceiro lado: ");
        double lado3 = scanner.nextDouble();

            if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("O triangulo é equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("O triangulo é isosceles.");
            } else {
                System.out.println("O triangulo é escaleno.");
            }
        } else {
                  System.out.println("Erro: Não é possível formar um triângulo com estas informações! ");
        }


    }
}



//20) Verificação de Triângulo:
//Escreva um programa que receba três valores que representam os lados de um triângulo e verifique se é possível formar um triângulo com eles.
//Se sim, determine se o triângulo é equilátero, isósceles ou escaleno.