package Aula02.Exercicios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é seu peso? => ");

        Double imc = scanner.nextDouble();

        if (imc < 18.5) {
            System.out.println( "Abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");

        } else if (imc >25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");

        } else
            System.out.println("Obesidade");

    }
}


//Verificar Faixa de IMC
//Declare uma variável para o Índice de Massa Corporal (IMC).
// Se o IMC for menor que 18.5, imprima "Abaixo do peso".
// Se o IMC for entre 18.5 e 24.9 (inclusive), imprima "Peso normal".
// Se o IMC for entre 25.0 e 29.9 (inclusive), imprima "Sobrepeso".
// Caso contrário, imprima "Obesidade".