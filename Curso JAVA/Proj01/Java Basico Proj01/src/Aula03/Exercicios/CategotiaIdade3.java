package Aula03.Exercicios;

import java.util.Scanner;

public class CategotiaIdade3 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.print("Qual a sua odade? ");
        int idade = scaner.nextInt();

        int categoria;

        if (idade < 11){
            categoria = 1;

        } else if (idade >=12 && idade <= 18) {
            categoria = 2;

        } else if (idade > 18 && idade <=65) {
            categoria = 3 ;

        }else {
            categoria = 4;
        }

           scaner.close();
    }
}

// Exemplo melhorado
/*package Aula02.Exercicios;

import java.util.Scanner;

public class Categoria_Idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();

        String categoria;

        if (idade < 11) {
            categoria = "Criança";
        } else if (idade <= 18) {
            categoria = "Adolescente";
        } else if (idade <= 65) {
            categoria = "Adulto";
        } else {
            categoria = "Idoso";
        }

        System.out.println(categoria);

        scanner.close();
    }
}
*/