package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        imprimirSistemas();
    }

    //Exemplo com inserção do codigo dentro de um METODO.

    public static void imprimirSistemas() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor da compra: ");
        double valorc = scanner.nextDouble();

        if (valorc > 100.00) {
            double desconto = valorc * 0.10;
            double valorcomDesconto = valorc - desconto;

            System.out.printf("Valor com desconto: R$ %.2f%n", valorcomDesconto);
        } else {
            System.out.printf("Valor total sem desconto: R$ %.2f%n", valorc);
        }

        scanner.close();
}
}



//9) Desconto Progressivo:
//Escreva um programa que leia o valor de uma compra e aplique um desconto de 10% se o valor for superior a R$ 100,00.