package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class CassificacaoNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a sua NOTA:  ");
       double notas = scanner.nextDouble();

       if (notas >= 60 ){
           System.out.println("Aprovado");
       }else {
           System.out.println("Reprovado");
       }

    }

}

//5) Classificação de Notas:
//Crie um programa que leia uma nota de 0 a 100 e exiba "Aprovado" se a nota for maior ou igual a 60, e "Reprovado" se for menor.









//5) Classificação de Notas:
//Crie um programa que leia uma nota de 0 a 100 e exiba "Aprovado" se a nota for maior ou igual a 60, e "Reprovado" se for menor.
