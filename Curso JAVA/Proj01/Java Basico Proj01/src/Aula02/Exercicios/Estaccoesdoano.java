package Aula02.Exercicios;

import java.util.Scanner;

public class Estaccoesdoano {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a temperatuta:  ");

        double temperatura = scanner.nextDouble();

            if (temperatura >= 30){
            System.out.print("Verão");

        } else if (temperatura >=20 && temperatura <30){
            System.out.println("Primavera");
            } else if (temperatura >=10 && temperatura <20) {
                System.out.println("Outono");
            }else{
                System.out.println("Inverno");

            }
    }

}



//2) - Verificar Estação do Ano
//Declare uma variável para representar a temperatura em graus Celsius.
//Se a temperatura for maior ou igual a 30, imprima "Verão".
//Se a temperatura for maior ou igual a 20 mas menor que 30, imprima "Primavera".
//Se a temperatura for maior ou igual a 10 mas menor que 20, imprima "Outono". Caso contrário, imprima "Inverno".