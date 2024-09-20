package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class discountVerification {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the purchase amount:  ");
        double valuec = scanner.nextDouble();

        if (valuec > 100.00) {
            double discount = valuec * 0.10;
            double discountedValue = valuec - discount;

            System.out.println(" Discounted price: R$:  " + " " + discountedValue);

        } else {
            System.out.println("Total amount without discount:" + "  " + valuec);
        }
    }
}


//9) Desconto Progressivo:
//Escreva um programa que leia o valor de uma compra e aplique um desconto de 10% se o valor for superior a R$ 100,00.