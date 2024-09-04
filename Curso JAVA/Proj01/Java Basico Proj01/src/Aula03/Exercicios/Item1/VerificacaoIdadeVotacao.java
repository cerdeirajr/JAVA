package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoIdadeVotacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a Idade:  ");

            int idade = scanner.nextInt();

            if (idade < 16){
                System.out.println("Não Elegivel para votação!" );
            } else if (idade >= 16 && idade <= 17) {
                System.out.println("Elegivel como Facutativo para votação! ");

            } else if (idade >= 18 && idade <= 70) {
                System.out.println("Elegivel como Obrigatorio para votação! ");

            }else {
                System.out.println("Elegivel como Facutativo Idoso para votação!  ");
            }
    }
}


//21) Verificação de Maioridade para Votação:
//Faça um programa que leia a idade de uma pessoa e verifique se ela é obrigada a votar (idade entre 18 e 70 anos),
// se o voto é facultativo (16-17 anos ou acima de 70 anos), ou se não pode votar (menor de 16 anos).