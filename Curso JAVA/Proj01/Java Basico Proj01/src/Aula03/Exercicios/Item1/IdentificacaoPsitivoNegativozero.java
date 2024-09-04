package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class IdentificacaoPsitivoNegativozero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com o numero para classificação:   ");

        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("Numero Pegativo! ");
        } else if (numero > 0) {
            System.out.println("Numero Positivo! ");

        }else {
            System.out.println("Numero Zero! ");
        }


    }
}


//3) Positivo, Negativo ou Zero:
//Faça um programa que leia um número e verifique se ele é positivo, negativo ou zero.