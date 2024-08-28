package Aula03.Exercicios;

import java.util.Scanner;

public class SwitchCatVeiculos {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.print(" Informe o peso do seu veiculo:  ");

        int peso = scaner.nextInt();

        switch(peso) {

            case 0: case 1:
                System.out.println("Categoria Veiculo LEVE!");
                break;

            case 2: case 3:
                System.out.print("Categoria Veiculo MEDIO!");
                break;

            default:
                System.out.print(" Categoria Veiculo PESADO!");
                break;

        }

    }
}
