package Aula02.Exercicios;

import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a pontação:  ");
        int pontuacao = scanner.nextInt();

        if (pontuacao >= 90){
            System.out.println("Excelente");
        } else if (pontuacao >= 70 && pontuacao <= 89) {
            System.out.println("Bom");

        } else if (pontuacao >= 50 && pontuacao <= 69) {
            System.out.println("Regular");

        }else
            System.out.println("Insuficiente");

    }
}

//Verificar Resultado de Avaliação
//Declare uma variável para a pontuação de uma avaliação.
//Se a pontuação for maior ou igual a 90, imprima "Excelente".
//Se a pontuação for entre 70 e 89 (inclusive), imprima "Bom".
//Se a pontuação for entre 50 e 69 (inclusive), imprima "Regular".
//Caso contrário, imprima "Insuficiente".