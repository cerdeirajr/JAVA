package Aula02.Exercicios;

import java.util.Scanner;

public class notaProva {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com a sua NOTA para classiticação =>  ");

        double note = scanner.nextDouble();

        if (note>= 8.0){
            System.out.println("Exelente");

    } else if (note >=5.0  && note <8.0) {
            System.out.println("Aprovado");
        }else{
            System.out.println( "Reprovado");
        }
            
        }
    }



//1) - Verificar Nota de Prova
//Declare uma variável para a nota de uma prova. Se a nota for maior ou igual a 8.0, imprima "Excelente".
//Se a nota for maior ou igual a 5.0 mas menor que 8.0, imprima "Aprovado".
//Caso contrário, imprima "Reprovado".