package Aula02.Exercicios;

import java.util.Scanner;

public class Categoria_Idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Digite sua Idade:  ");
        int idade = scanner.nextInt() ;


           if (idade < 11){
               System.out.println( "Criança");
           } else if ( idade >= 12 && idade <=18 ) {
            System.out.println( "Adolecente");
               
           } else if (idade >18 && idade <= 65) {
               System.out.println( " Adulto");

           }else
               System.out.println( " Idoso");

    }
}



//1)Verificar Categoria de Idade
//Declare uma variável para a idade. Se a idade for menor que 12, imprima "Criança".
//Se a idade for entre 12 e 18 anos (inclusive), imprima "Adolescente".
//Se a idade for maior que 18 mas menor que 65, imprima "Adulto".
//Caso contrário, imprima "Idoso".'