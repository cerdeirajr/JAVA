package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoDeAnoBissexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite com o ANO: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0)) {
            System.out.println(ano + " ano Bissexto!");

        }else {
            System.out.println(ano + " não é ano Bissexto!");
        }


    }
}




//11) Verificação de Ano Bissexto:
//Faça um programa que receba um ano e verifique se ele é bissexto ou não.
