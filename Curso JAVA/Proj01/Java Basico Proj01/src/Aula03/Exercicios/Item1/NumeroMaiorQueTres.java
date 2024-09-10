package Aula03.Exercicios.Item1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NumeroMaiorQueTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o Primeiro Numero Inteirio:  ");
        int numero1 = scanner.nextInt();

        System.out.print(" Entre com o Segundo Numero Inteiro:   ");
        int numero2 = scanner.nextInt();

        System.out.print(" Entre com o Terceiro Numero Inteiro:  ");
        int numero3 = scanner.nextInt();

        int numeromaior = numero1;

        if (numero2 > numeromaior) {
            numeromaior = numero2;

        }

        if (numero3 > numeromaior){
            numeromaior = numero3;
        }

        System.out.println(" Entre os numeros " + " - " + numero1 + " - " + numero2 + " - " + numero3 + " - " + " O numero maior é :" + numeromaior);

    }
}




// 4)Maior de Três Números:
//Escreva um programa que receba três números inteiros e determine qual deles é o maior.