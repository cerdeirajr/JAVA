package Aula03.Exercicios.Item1;

import java.util.Scanner;

public class precoDescontoAcrecimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a condição de pagamento (1 para à vista, 2 para parcelado): ");
        int condicao = scanner.nextInt();

        double precoFinal;
        if (condicao == 1) {
            precoFinal = preco * 0.90;
            System.out.println("Pagamento à vista. O preço com desconto é: R$ " + precoFinal);

        } else if (condicao == 2) {
            precoFinal = preco * 1.05;
            System.out.println("Pagamento parcelado. O preço com acréscimo é: R$ " + precoFinal);

        } else {
            System.out.println("Erro: Condição de pagamento inválida.");
        }


    }
}






//22) Preço com Desconto ou Acréscimo:
//Crie um programa que receba o preço de um produto e uma condição de pagamento (à vista ou parcelado).
//Aplique um desconto de 10% para pagamento à vista e um acréscimo de 5% para pagamento parcelado.
