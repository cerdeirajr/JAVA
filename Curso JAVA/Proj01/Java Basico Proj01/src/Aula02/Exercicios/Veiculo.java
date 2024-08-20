package Aula02.Exercicios;

import java.util.Scanner;

public class Veiculo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a cilindrada do seu veiculo? => ");
        
        int cilindradas = scanner.nextInt();
        
        if (cilindradas < 1000) {
            System.out.println("Subcompacto");
        } else if (cilindradas >= 1000 && cilindradas <= 1600 ) {
            System.out.println("Compacto");
            
        } else if (cilindradas >= 1601 && cilindradas <= 2000) {
            System.out.println("Medio");

        }else
            System.out.println("Grande");
    }
}


//Verificar Categoria de Veículo por Cilindrada
//Declare uma variável para a cilindrada de um veículo.
//Se a cilindrada for menor que 1000, imprima "Subcompacto".
//Se for entre 1000 e 1600 (inclusive), imprima "Compacto".
//Se for entre 1601 e 2000 (inclusive), imprima "Médio".
//Caso contrário, imprima "Grande".