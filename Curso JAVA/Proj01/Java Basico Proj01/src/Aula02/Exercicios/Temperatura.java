package Aula02.Exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

       // Scanner carro = new Scanner(System.in);
       Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a Temperatura: ");

        double temperatura = scanner.nextDouble();

        if (temperatura < 0){
            System.out.println("Muito frio");

        } else if (temperatura >= 0 && temperatura <=15) {
            System.out.println("Frio");

        } else if (temperatura >= 16 && temperatura <= 30) {
            System.out.println("Agradavel");

        }else
            System.out.println("Calor");

    }
}

//6)Verificar Faixa de Temperatura
//Declare uma variável para a temperatura.
//Se a temperatura for menor que 0, imprima "Muito frio".
//Se for entre 0 e 15 (inclusive), imprima "Frio".
//Se for entre 16 e 30 (inclusive), imprima "Agradável".
//Caso contrário, imprima "Calor".