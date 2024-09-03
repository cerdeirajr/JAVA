package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificaMaiorIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Idade:  ");
        int idade = scanner.nextInt();

        if (idade < 18){
            System.out.println("Vocé é menor de idade!");
        }else
            System.out.println("Vocé é maior de Idade! ");
    }
}


//1) Verificação de Maioridade:
//Escreva um programa que leia a idade de uma pessoa e exiba se ela é maior de idade (18 anos ou mais) ou menor de idade.