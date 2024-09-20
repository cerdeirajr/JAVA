package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class verificationVowelConsonant {
    public static void main(String[] args) {


    }

    public static void vowel(){

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a letra do usuário
        System.out.print("Type a letter:");
        char letter = scanner.next().charAt(0);

        // Converte a letra para minúscula para facilitar a verificação
        letter = Character.toLowerCase(letter);

        // Verifica se é uma letra válida
        if (Character.isLetter(letter)) {
            // Verifica se é uma vogal
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Letter " + letter + " is a vowel.");
            } else {
                System.out.println("Letter " + letter + " is a consonant.");
            }
        } else {
            // Se não for uma letra válida
            System.out.println("Error: The character entered is not a letter.");
        }


    }
}


//16) Verificação de Vogal ou Consoante:ok
//Faça um programa que leia uma letra e verifique se ela é uma vogal ou consoante.
// Trate tanto letras maiúsculas quanto minúsculas.