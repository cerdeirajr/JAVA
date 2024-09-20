package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class ClassificacaoAnoEscolar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.print("Entre com a Idade: ");

        int idade = scanner.nextInt();

        if (idade >= 0 && idade <= 5){
            System.out.println(" Ensino INFATIL ! ");
        } else if (idade >=6 && idade <= 10) {
            System.out.println(" Ensino Fundamental I ! ");

        } else if (idade >= 11 && idade <= 14 ) {
            System.out.println(" Ensino Fundamental II ! ");

        } else if (idade >= 15 && idade <= 17 ) {
            System.out.println(" Ensino Medio! ");

        }else {
            System.out.println(" Idade não faz parte da classificação ! ");
        }


    }
}


//23) Ano Escolar:
//Escreva um programa que leia a idade de uma criança e determine em qual ano escolar ela está (ex: Infantil, Fundamental I, Fundamental II, Médio).
// Se a idade não corresponder a nenhum ano escolar, exiba uma mensagem de erro.


// Infantil - 0 a 5 anos
//Fundamental 1 - 6 á 10 Anos
//Fundamental 2 - 11 á 14 anos
//Medio 15 á 17 Anos