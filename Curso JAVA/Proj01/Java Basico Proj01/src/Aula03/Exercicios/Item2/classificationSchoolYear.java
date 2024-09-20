package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class classificationSchoolYear {
    public static void main(String[] args) {
        schoolYear();
    }

    public static void schoolYear(){

        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Age: ");

        int age = scanner.nextInt();

        if (age >= 0 && age <= 5){
            System.out.println(" EARLY CHILDHOOD ! ");
        } else if (age >=6 && age <= 10) {
            System.out.println(" Elementary School I ! ");

        } else if (age >= 11 && age <= 14 ) {
            System.out.println(" Elementary School II ! ");

        } else if (age >= 15 && age <= 17 ) {
            System.out.println(" High School !");

        }else {
            System.out.println(" Age is not part of the classification!");
        }


    }
}


//23) Ano Escolar:
//Escreva um programa que leia a idade de uma criança e determine em qual ano escolar ela está (ex: Infantil, Fundamental I, Fundamental II, Médio).
// Se a idade não corresponder a nenhum ano escolar, exiba uma mensagem de erro.


// Infantil - 0 a 5 anos
//Fundamental 1 - 6 á 10 Anos
//Fundamental 2 - 11 á 14 anos
//Medio 15 á 17 Anos