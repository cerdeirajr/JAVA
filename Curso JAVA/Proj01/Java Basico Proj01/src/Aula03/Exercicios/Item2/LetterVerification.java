package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class LetterVerification {
    public static void main(String[] args) {
        vowelConsonant();
    }

    public static void vowelConsonant () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a letter:  ");

        char letters = scanner.next().charAt(0);

        //**** Converte a letra para minúscula para facilitar a verificação
        letters = Character.toLowerCase(letters);

        // Verifica se é uma letra válida
        if (letters >= 'a' && letters <= 'z') {

            if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u') {
                System.out.println("The letter " + letters + " is a vowel.");
            } else {
                System.out.println("The letter " + letters + " is a consonant.");
            }
        } else {
            System.out.println("Error: The character you entered is not a letter.");
        }


    }
}


//OBS. O mesmo que o Exec 16!


//10) Verificação de Letra:
//Crie um programa que leia um caractere e verifique se ele é uma vogal ou uma consoante.