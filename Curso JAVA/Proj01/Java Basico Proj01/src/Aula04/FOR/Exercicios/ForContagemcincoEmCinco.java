package Aula04.FOR.Exercicios;

public class ForContagemcincoEmCinco {
    public static void main(String[] args) {
       contagemcinco();
    }

    public static void contagemcinco (){
        for (int i = 5; i>= -5; i--){
            System.out.println("contagem:  " + i);
        }
    }

}


//Exercício 2:Descrição: Desenvolva um programa que utilize um laço for para imprimir os números de 5 a -5.
//O programa deve iniciar em 5 e diminuir até -5, exibindo cada número com a mensagem "Contagem: ".