package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class verificacaoVogalConsoante {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a letra do usuário
        System.out.print("Digite uma letra: ");
        char letra = scanner.next().charAt(0);

        // Converte a letra para minúscula para facilitar a verificação
        letra = Character.toLowerCase(letra);

        // Verifica se é uma letra válida
        if (Character.isLetter(letra)) {
            // Verifica se é uma vogal
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra " + letra + " é uma vogal.");
            } else {
                System.out.println("A letra " + letra + " é uma consoante.");
            }
        } else {
            // Se não for uma letra válida
            System.out.println("Erro: O caractere digitado não é uma letra.");
        }


    }
}


//16) Verificação de Vogal ou Consoante:ok
//Faça um programa que leia uma letra e verifique se ela é uma vogal ou consoante.
// Trate tanto letras maiúsculas quanto minúsculas.