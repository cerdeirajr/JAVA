package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class athleteCategory {


    public static void main(String[] args) {
        printCategoryAthlete(); // Chamar ele no metodo principal !

    }

        public static void printCategoryAthlete () {    // Metodo novo !
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter Age: ");

            int ege = scanner.nextInt();

            if (ege >=0 && ege <=13){
                System.out.println( "Your category is Children!");
            } else if (ege >=14 && ege <=17) {
                System.out.println("Your category is Youth!");

            }else {
                System.out.println("Your category is Adult!");

            }


        }
}

//8) Categoria de Atleta:
//Crie um programa que receba a idade de um atleta e exiba a sua categoria (Infantil, Juvenil, Adulto, etc.).