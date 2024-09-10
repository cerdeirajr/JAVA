package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoDoDesconto {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print(" Entre com o valor da compra:  ");
        double valorc = scanner.nextDouble();

        if (valorc > 100.00) {
            double desconto = valorc * 0.10;
            double valorcomDesconto = valorc - desconto;

            System.out.println(" valor com desconto :  R$: " + " " + valorcomDesconto);

        } else {
            System.out.println("Valor total sem Desconto:" + "  " + valorc);
        }
    }
}


//9) Desconto Progressivo:
//Escreva um programa que leia o valor de uma compra e aplique um desconto de 10% se o valor for superior a R$ 100,00.