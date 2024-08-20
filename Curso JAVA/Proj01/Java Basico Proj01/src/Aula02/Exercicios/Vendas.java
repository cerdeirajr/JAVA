package Aula02.Exercicios;

import java.util.Scanner;

public class Vendas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade de vendas! => ");

        double total = scanner.nextDouble();

        if (total >= 100){
            System.out.println("Meta Excedida");
        } else if (total <= 99 && total >= 50) {
            System.out.println("Meta Alcançada");

        } else if (total <= 49 && total >= 20) {
            System.out.println("Abaixo da Mete");

        }else
            System.out.println("Fraco Desempenho");


    }
}

//Verificar Desempenho de Vendas --Ok
//Declare uma variável para o total de vendas realizadas.
//Se o total de vendas for maior ou igual a 100, imprima "Meta excedida".
//Se for entre 50 e 99 (inclusive), imprima "Meta alcançada".
//Se for entre 20 e 49 (inclusive), imprima "Abaixo da meta".
//Caso contrário, imprima "Fraco desempenho".