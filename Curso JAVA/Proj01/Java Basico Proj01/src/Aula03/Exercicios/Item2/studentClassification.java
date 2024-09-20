package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class studentClassification {
    public static void main(String[] args) {


    }

    public static void student (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st Grade:  ");
        double grade01 = scanner.nextDouble();

        System.out.print("Enter 2st Grade:  ");
        double grade02 = scanner.nextDouble();

        double average = (grade01 + grade02 ) / 2;

        if (average >= 7) {
            System.out.println("Passed ");
        } else if (average >= 5) {
            System.out.println("Recovered ");

        }else {
            System.out.println("Failed ");
        }

    }
}


//13) Aprovado ou Reprovado com Recuperação:
//Escreva um programa que leia duas notas de um aluno e calcule a média. Se a média for maior ou igual a 7, exiba "Aprovado".
// Se a média estiver entre 5 e 7, exiba "Recuperação". Caso contrário, exiba "Reprovado".