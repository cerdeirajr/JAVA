package Aula03.Exercicios.Item2;

import java.util.Scanner;

public class priceDiscountIncrease {

    public static void main(String[] args) {
        discountIncrease();

    }

    public static void discountIncrease (){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product price:  ");
        double price = scanner.nextDouble();

        System.out.print("Enter the payment terms (1 for cash, 2 for installments): ");
        int condition = scanner.nextInt();

        double finalPrice;
        if (condition == 1) {
            finalPrice = price * 0.90;
            System.out.println("Payment in cash. The price with discount is: R$ " + finalPrice);

        } else if (condition == 2) {
            finalPrice = price * 1.05;
            System.out.println("Payment in installments. The price with increase is: R$" + finalPrice);

        } else {
            System.out.println("Error: Invalid payment terms.");
        }


    }
}






//22) Preço com Desconto ou Acréscimo:
//Crie um programa que receba o preço de um produto e uma condição de pagamento (à vista ou parcelado).
//Aplique um desconto de 10% para pagamento à vista e um acréscimo de 5% para pagamento parcelado.
