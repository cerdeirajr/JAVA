package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class ClassificacaoAluno {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a 1° Nota:  ");
        double nota01 = scanner.nextDouble();

        System.out.print("Entre com a 2° Nota:  ");
        double nota02 = scanner.nextDouble();

        double media = (nota01 + nota02 ) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");

        }else {
            System.out.println("Reprovado");
        }

    }
}


//13) Aprovado ou Reprovado com Recuperação:
//Escreva um programa que leia duas notas de um aluno e calcule a média. Se a média for maior ou igual a 7, exiba "Aprovado".
// Se a média estiver entre 5 e 7, exiba "Recuperação". Caso contrário, exiba "Reprovado".