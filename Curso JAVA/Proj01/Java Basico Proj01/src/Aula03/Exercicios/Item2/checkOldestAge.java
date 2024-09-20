package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class checkOldestAge {
    public static void main(String[] args) {
        oldestAge();

    }

    public static void oldestAge (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age:   ");
        int age = scanner.nextInt();

        if (age < 18){
            System.out.println("You are underage!");
        }else
            System.out.println("You are of legal age! ");
    }
}


//1) Verificação de Maioridade:
//Escreva um programa que leia a idade de uma pessoa e exiba se ela é maior de idade (18 anos ou mais) ou menor de idade.