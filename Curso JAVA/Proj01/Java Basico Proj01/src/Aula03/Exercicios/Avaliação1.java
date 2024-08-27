package Aula03.Exercicios;

import java.util.Scanner;

public class Avaliação1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("Entre com a sua Nota: ");

        int pontuacao = scaner.nextInt();
        String categoria;



        if ( pontuacao >= 90) {
            categoria = "Excelente";

            }else if (pontuacao >=70 && pontuacao <=89){
            categoria = "Bom";


            } else if (pontuacao >=50 && pontuacao <=69) {
            categoria = "Regular";

        } else
            categoria = " Insuficiente";
        System.out.println(categoria);

        scaner.close();

    }
}
