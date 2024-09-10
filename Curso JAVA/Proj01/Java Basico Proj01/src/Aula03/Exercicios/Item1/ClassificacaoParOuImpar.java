package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class ClassificacaoParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("entre com um numero Inteiro: ");

        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println( "O numero informado" + "  " + numero + "  " + "é PAR !");
        }else {
            System.out.println("O numero informado" + "  " + numero + "  " + " é Impar! ");
        }

    }
}



// 2) Par ou Ímpar:
//Crie um programa que receba um número inteiro e verifique se ele é par ou ímpar.