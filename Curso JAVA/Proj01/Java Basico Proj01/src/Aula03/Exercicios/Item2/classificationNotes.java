package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class classificationNotes {

    public static void main(String[] args) {

        classification();
    }

    public static void classification (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your GRADE:");
       double grade = scanner.nextDouble();

       if (grade >= 60 ){
           System.out.println("Passed");
       }else {
           System.out.println("failed");
       }

    }

}

//5) Classificação de Notas:
//Crie um programa que leia uma nota de 0 a 100 e exiba "Aprovado" se a nota for maior ou igual a 60, e "Reprovado" se for menor.









//5) Classificação de Notas:
//Crie um programa que leia uma nota de 0 a 100 e exiba "Aprovado" se a nota for maior ou igual a 60, e "Reprovado" se for menor.
