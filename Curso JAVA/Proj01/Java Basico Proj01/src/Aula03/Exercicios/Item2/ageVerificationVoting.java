package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class ageVerificationVoting {
    public static void main(String[] args) {
        votingAge();
    }

    public static void votingAge (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

            int age = scanner.nextInt();

            if (age < 16){
                System.out.println("Not Eligible to Vote!" );
            } else if (age >= 16 && age <= 17) {
                System.out.println("Eligible to vote! ");

            } else if (age >= 18 && age <= 70) {
                System.out.println("Eligible as Required to vote! ");

            }else {
                System.out.println("Eligible as Optional Elderly for vote! ");
            }
    }
}


//21) Verificação de Maioridade para Votação:
//Faça um programa que leia a idade de uma pessoa e verifique se ela é obrigada a votar (idade entre 18 e 70 anos),
// se o voto é facultativo (16-17 anos ou acima de 70 anos), ou se não pode votar (menor de 16 anos).