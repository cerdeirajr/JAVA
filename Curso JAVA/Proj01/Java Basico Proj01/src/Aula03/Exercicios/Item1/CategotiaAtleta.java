package Aula03.Exercicios.Item1;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class CategotiaAtleta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a Idade do atleta para Classificação:  ");

        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 13 ){
            System.out.println("Classificação INFANTIL!");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Classificação JUVENIL!");

        } else if (idade >=18 && idade <=59) {
            System.out.println("Classificação ADULTO!");

        }else {
            System.out.println("Classificação IDOSO!");
        }


    }
}


//8) Categoria de Atleta:
//Crie um programa que receba a idade de um atleta e exiba a sua categoria (Infantil, Juvenil, Adulto, etc.).