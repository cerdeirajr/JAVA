package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoParentesco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Entre com o Primeiro nome:  ");
        String nomeA = scanner.nextLine();
            System.out.print(" Entre com a Idade do Primeiro nome:  ");
        int idadeA = scanner.nextInt();

        scanner.nextLine();


            System.out.print("Entre com o Segunda nome:  ");
        String nomeB = scanner.nextLine();
            System.out.print(" Entre com a Idade do Segunde nome:  ");
        int idadeB = scanner.nextInt();

        if (idadeA == idadeB){
            System.out.print("As duas pessoas tem a mesma idade.");
        }else {
            System.out.println("As duas pessoas tem idades diferentes.");

        }


    }
}



//6) Verificação de Parentesco:
//Escreva um programa que receba o nome e a idade de duas pessoas e verifique se ambas têm a mesma idade.