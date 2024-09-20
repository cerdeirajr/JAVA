package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class kinshipCheck {
    public static void main(String[] args) {
        kinship();
    }

    public static void kinship (){

    Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your first name:  ");
        String nameA = scanner.nextLine();
            System.out.print(" Enter Age of First Name:  ");
        int ageA = scanner.nextInt();

        scanner.nextLine();


            System.out.print("Enter Second Name:  ");
        String nameB = scanner.nextLine();
            System.out.print(" Enter Second Name Age:   ");
        int ageB = scanner.nextInt();

        if (ageA == ageB){
            System.out.print("The two people are the same age.");
        }else {
            System.out.println("The two people are different ages.");

        }


    }
}



//6) Verificação de Parentesco:
//Escreva um programa que receba o nome e a idade de duas pessoas e verifique se ambas têm a mesma idade.