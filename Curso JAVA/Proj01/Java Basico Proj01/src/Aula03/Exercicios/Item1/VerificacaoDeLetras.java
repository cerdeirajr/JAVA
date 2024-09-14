package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class VerificacaoDeLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:   ");

        char letra = scanner.next().charAt(0);

        //**** Converte a letra para minúscula para facilitar a verificação
        letra = Character.toLowerCase(letra);

        // Verifica se é uma letra válida
        if (letra >= 'a' && letra <= 'z') {

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra " + letra + " é uma vogal.");
            } else {
                System.out.println("A letra " + letra + " é uma consoante.");
            }
        } else {

            System.out.println("Erro: O caractere digitado não é uma letra.");
        }


    }
}


//OBS. O mesmo que o Exec 16!


//10) Verificação de Letra:
//Crie um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.