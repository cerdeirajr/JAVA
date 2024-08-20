package Aula02.Exercicios;

import java.util.Scanner;

public class CategoriaVeiculo {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.print(" Qual o peso do veiculo:  ");

        double peso = scanner.nextDouble();

        if (peso <1 ){
            System.out.println("Veiculo Leve");
        } else if (peso >=1 && peso <3) {
            System.out.println("Veiculo Medio");

        }else
            System.out.println("Veiculo Pesado");
    }
}
